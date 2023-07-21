package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Table(name = "[EventType]")
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventTypeID")
    private Long eventTypeID;

    @NotBlank(message = "The location type name cannot be empty!")
    @Column(name = "eventTypeName", unique = true)
    private String eventTypeName;

    @OneToMany(mappedBy = "eventType", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Event> eventsList;

    public EventType(Long eventTypeID, String eventTypeName, List<Event> eventsList) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
        this.eventsList = eventsList;
    }

    public Long getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public List<Event> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Event> eventsList) {
        this.eventsList = eventsList;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + eventTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                ", eventsList=" + eventsList +
                '}';
    }
}
