package com.endavaapprentice.EventTicketSystem.service.EventService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Event;

import java.util.List;

public interface EventServiceInterface {
    List<Event> getAllEvent();
    Event getEventById(Long eventId);
    List<EventVenueEventTypeDTO> getAllEventByTypeAndVenue(Long venueId, String eventTypeName);
}
