package com.eventticketsystem.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "[Event]")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventID")
    private Long eventID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "venueID", referencedColumnName = "venueID")
    private Venue venue;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "eventTypeID", referencedColumnName = "eventTypeID")
    private EventType eventType;

    @Column(name = "eventDescription")
    private String eventDescription;

    @NotBlank(message = "The event must have a name!")
    @Column(name = "eventName")
    private String eventName;

    @Column(name = "eventImageURL")
    private String eventImageURL;

    @DateTimeFormat
    @Column(name = "startDate")
    private LocalDateTime startDate;

    @DateTimeFormat
    @Column(name = "endDate")
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<TicketCategory> ticketsCategoryList;

    public Event(Long eventID, Venue venue, EventType eventType,
                 String eventDescription, String eventName,
                 String eventImageURL, LocalDateTime startDate,
                 LocalDateTime endDate, List<TicketCategory> ticketsCategoryList) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.eventImageURL = eventImageURL;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ticketsCategoryList = ticketsCategoryList;
    }

    public Event() {
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventImageURL() {
        return eventImageURL;
    }

    public void setEventImageURL(String eventImageURL) {
        this.eventImageURL = eventImageURL;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategory> getTicketsCategoryList() {
        return ticketsCategoryList;
    }

    public void setTicketsCategoryList(List<TicketCategory> ticketsCategoryList) {
        this.ticketsCategoryList = ticketsCategoryList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", venue=" + venue +
                ", eventType=" + eventType +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventImageURL='" + eventImageURL + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", ticketsCategoryList=" + ticketsCategoryList +
                '}';
    }
}
