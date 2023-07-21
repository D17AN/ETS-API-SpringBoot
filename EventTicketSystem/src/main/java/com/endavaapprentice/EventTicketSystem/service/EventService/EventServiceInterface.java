package com.endavaapprentice.EventTicketSystem.service.EventService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Event;

import java.util.List;

public interface EventServiceInterface {
    List<Event> getAllEvents();
    Event getEventByID(Long eventID);
    List<EventVenueEventTypeDTO> getAllEventsByTypeAndVenue(Long venueID, String eventTypeName);
}

