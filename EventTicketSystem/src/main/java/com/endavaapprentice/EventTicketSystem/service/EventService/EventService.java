package com.endavaapprentice.EventTicketSystem.service.EventService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.LocationDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.TicketCategoryDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.VenueDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Event;
import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;
import com.endavaapprentice.EventTicketSystem.repository.EventRepository.EventRepositoryInterface;
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
    public List<Event> getAllEvent(){
        return this.eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long eventId){
        return this.eventRepository.findById(eventId).get();
    }

    @Override
    public List<EventVenueEventTypeDTO> getAllEventByTypeAndVenue(Long venueId, String eventTypeName){
        List<EventVenueEventTypeDTO> eventVenueEventTypeDTOCollection = new ArrayList<>();
        List<Event> eventsList = this.eventRepository.findAll().stream().filter(event -> {
            return event.getVenue().getVenueID() == venueId &&
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
