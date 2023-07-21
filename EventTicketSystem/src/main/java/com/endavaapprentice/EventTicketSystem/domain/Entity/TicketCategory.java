package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

@Entity
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

    public TicketCategory(Long ticketCategoryID, Event event, String ticketType,
                          BigDecimal price, List<Order> ordersList) {
        this.ticketCategoryID = ticketCategoryID;
        this.event = event;
        this.ticketType = ticketType;
        this.price = price;
        this.ordersList = ordersList;
    }

    public TicketCategory() {
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", event=" + event +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", ordersList=" + ordersList +
                '}';
    }
}
