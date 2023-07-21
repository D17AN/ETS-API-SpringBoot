package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "[TicketCategory]")
public class TicketCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryID")
    private Long ticketCategoryID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "eventID", referencedColumnName = "eventID")
    private Event event;

    @Pattern(regexp = "^(standard|vip)$",
            message = "The ticket must be standard or vip!")
    @Column(name = "ticketType")
    private String ticketType;

    @Positive
    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "ticketCategory",
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> ordersList;
}
