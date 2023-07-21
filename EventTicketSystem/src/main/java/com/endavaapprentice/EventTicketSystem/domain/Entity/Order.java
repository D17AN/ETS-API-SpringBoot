package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "[Order]")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderID")
    private Long orderID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ticketCategoryID", referencedColumnName = "ticketCategoryID")
    private TicketCategory ticketCategory;

    @DateTimeFormat
    @PastOrPresent
    @Column(name = "orderedAt")
    private LocalDateTime orderedAt;

    @Positive
    @Column(name = "numberOfTickets")
    private Integer numberOfTickets;

    @PositiveOrZero
    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public Order() {
    }

    public Order(Long orderID, User user, TicketCategory ticketCategory,
                 LocalDateTime orderedAt, Integer numberOfTickets,
                 BigDecimal totalPrice) {
        this.orderID = orderID;
        this.user = user;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", user=" + user +
                ", ticketCategory=" + ticketCategory +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
