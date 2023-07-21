package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

@Entity
@Table(name = "[Venue]")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venueID")
    private Long venueID;

    @NotNull(message = "The venue must have a location!")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationID", referencedColumnName = "locationID")
    private Location location;

    @NotBlank(message = "The location must have a type!")
    @Column(name = "type")
    private String type;

    @Positive(message = "The capacity must be a positive integer!")
    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "venue", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Event> eventsList;

    public Venue(Long venueID, Location location,
                 String type, Integer capacity,
                 List<Event> eventsList) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        this.eventsList = eventsList;
    }

    public Long getVenueID() {
        return venueID;
    }

    public void setVenueID(Long venueID) {
        this.venueID = venueID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Event> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Event> eventsList) {
        this.eventsList = eventsList;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", location=" + location +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", eventsList=" + eventsList +
                '}';
    }
}
