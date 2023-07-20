package com.endavaapprentice.EventTicketSystem.service.EventTypeService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.EventType;

public interface EventTypeServiceInterface {
    EventType getEventTypeById(Long eventTypeId);
    EventType getEventTypeByName(String eventTypeName);
}
