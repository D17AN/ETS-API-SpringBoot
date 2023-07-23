package com.eventticketsystem.EventTicketSystem.service.EventService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Event;

import java.util.List;

public interface EventServiceInterface {
    List<Event> getAllEvents();
    Event getEventByID(Long eventID);
    List<EventVenueEventTypeDTO> getAllEventsByTypeAndVenue(Long venueID, String eventTypeName);
}

