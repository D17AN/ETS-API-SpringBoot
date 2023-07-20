package com.endavaapprentice.EventTicketSystem.service.EventTypeService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.EventType;

import java.util.Collection;

public interface EventTypeServiceInterface {
    Collection<EventType> getAllEventType();
    EventType getEventTypeById(Long eventTypeId);
    EventType getEventTypeByName(String eventTypeName);
}
