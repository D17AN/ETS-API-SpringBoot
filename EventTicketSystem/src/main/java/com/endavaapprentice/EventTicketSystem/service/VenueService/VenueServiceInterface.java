package com.endavaapprentice.EventTicketSystem.service.VenueService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;

import java.util.Collection;

public interface VenueServiceInterface {
    Collection<Venue> getAllVenue();
    Venue getVenueById(Long venueId);
}
