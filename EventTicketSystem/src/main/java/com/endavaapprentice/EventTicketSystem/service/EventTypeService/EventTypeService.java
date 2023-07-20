package com.endavaapprentice.EventTicketSystem.service.EventTypeService;


import com.endavaapprentice.EventTicketSystem.domain.Entity.EventType;
import com.endavaapprentice.EventTicketSystem.repository.EventTypeRepository.EventTypeRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class EventTypeService implements EventTypeServiceInterface{

    private EventTypeRepositoryInterface eventTypeRepository;

    public EventTypeService(EventTypeRepositoryInterface eventTypeRepository){
        this.eventTypeRepository = eventTypeRepository;
    }

    @Override
    public EventType getEventTypeById(Long eventTypeId){
        return this.eventTypeRepository.getReferenceById(eventTypeId);
    }

    @Override
    public EventType getEventTypeByName(String eventTypeName){
        return this.eventTypeRepository.findAll().stream().filter(otherEventType -> {
            return otherEventType.getEventTypeName().equalsIgnoreCase(eventTypeName);
        }).findFirst().get();
    }
}
