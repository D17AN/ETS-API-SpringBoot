package com.eventticketsystem.EventTicketSystem.service.EventTypeService;


import com.eventticketsystem.EventTicketSystem.domain.Entity.EventType;
import com.eventticketsystem.EventTicketSystem.repository.EventTypeRepository.EventTypeRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeService implements EventTypeServiceInterface{

    private EventTypeRepositoryInterface eventTypeRepository;

    public EventTypeService(EventTypeRepositoryInterface eventTypeRepository){
        this.eventTypeRepository = eventTypeRepository;
    }

    @Override
    public List<EventType> getAllEventsType(){
        return this.eventTypeRepository.findAll();
    }

    @Override
    public EventType getEventTypeByID(Long eventTypeID){
        return this.eventTypeRepository.getReferenceById(eventTypeID);
    }

    @Override
    public EventType getEventTypeByName(String eventTypeName){
        return this.eventTypeRepository.findAll().stream().filter(otherEventType -> {
            return otherEventType.getEventTypeName().equalsIgnoreCase(eventTypeName);
        }).findFirst().get();
    }
}
