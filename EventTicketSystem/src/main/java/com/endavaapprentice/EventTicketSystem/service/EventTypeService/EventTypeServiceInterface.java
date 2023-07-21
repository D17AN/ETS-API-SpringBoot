package com.endavaapprentice.EventTicketSystem.service.EventTypeService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.EventType;

import java.util.List;

public interface EventTypeServiceInterface {
    List<EventType> getAllEventsType();
    EventType getEventTypeByID(Long eventTypeID);
    EventType getEventTypeByName(String eventTypeName);
}
