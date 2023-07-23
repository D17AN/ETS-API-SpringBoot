package com.eventticketsystem.EventTicketSystem.service.EventService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.eventticketsystem.EventTicketSystem.domain.DTO.LocationDTO;
import com.eventticketsystem.EventTicketSystem.domain.DTO.TicketCategoryDTO;
import com.eventticketsystem.EventTicketSystem.domain.DTO.VenueDTO;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Event;
import com.eventticketsystem.EventTicketSystem.domain.Entity.TicketCategory;
import com.eventticketsystem.EventTicketSystem.repository.EventRepository.EventRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements EventServiceInterface{

    private EventRepositoryInterface eventRepository;

    public EventService(EventRepositoryInterface eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAllEvents(){
        return this.eventRepository.findAll();
    }

    @Override
    public Event getEventByID(Long eventID){
        return this.eventRepository.findById(eventID).get();
    }

    @Override
    public List<EventVenueEventTypeDTO> getAllEventsByTypeAndVenue(Long venueID, String eventTypeName){
        List<EventVenueEventTypeDTO> eventVenueEventTypeDTOCollection = new ArrayList<>();
        List<Event> eventsList = this.eventRepository.findAll().stream().filter(event -> {
            return event.getVenue().getVenueID() == venueID &&
                    event.getEventType().getEventTypeName().equalsIgnoreCase(eventTypeName);
        }).toList();

        for (Event event: eventsList){
            LocationDTO locationDTO = new LocationDTO(event.getVenue().getLocation().getCountryName(),
                    event.getVenue().getLocation().getCityName(),
                    event.getVenue().getLocation().getAddress());

            VenueDTO venueDTO = new VenueDTO(event.getVenue().getVenueID(),
                        event.getVenue().getType(),
                        event.getVenue().getCapacity(),
                        locationDTO);
            List<TicketCategoryDTO> ticketCategoryDTOList = new ArrayList<>();
            for (TicketCategory ticketCategory: event.getTicketsCategoryList()){
                TicketCategoryDTO ticketCategoryDTO =  new TicketCategoryDTO(ticketCategory.getTicketCategoryID(),
                        ticketCategory.getTicketType(),
                        ticketCategory.getPrice());
                ticketCategoryDTOList.add(ticketCategoryDTO);
            }
            EventVenueEventTypeDTO eventDTO = new EventVenueEventTypeDTO(
                    event.getEventID(),
                    venueDTO,
                    event.getEventType().getEventTypeName(),
                    event.getEventDescription(),
                    event.getEventName(),
                    event.getEventImageURL(),
                    event.getStartDate(),
                    event.getEndDate(),
                    ticketCategoryDTOList

            );
            eventVenueEventTypeDTOCollection.add(eventDTO);
        }
        return eventVenueEventTypeDTOCollection;
    }
}
