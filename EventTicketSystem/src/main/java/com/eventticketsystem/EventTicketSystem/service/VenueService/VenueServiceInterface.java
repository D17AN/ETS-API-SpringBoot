package com.eventticketsystem.EventTicketSystem.service.VenueService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Venue;

import java.util.List;

public interface VenueServiceInterface {
    List<Venue> getAllVenues();
    Venue getVenueByID(Long venueID);
}
