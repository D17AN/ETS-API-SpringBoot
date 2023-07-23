package com.eventticketsystem.EventTicketSystem.service.EventTypeService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.EventType;

import java.util.List;

public interface EventTypeServiceInterface {
    List<EventType> getAllEventsType();
    EventType getEventTypeByID(Long eventTypeID);
    EventType getEventTypeByName(String eventTypeName);
}
