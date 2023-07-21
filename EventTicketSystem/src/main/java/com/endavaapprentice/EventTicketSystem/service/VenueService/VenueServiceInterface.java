package com.endavaapprentice.EventTicketSystem.service.VenueService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;

import java.util.List;

public interface VenueServiceInterface {
    List<Venue> getAllVenues();
    Venue getVenueByID(Long venueID);
}
