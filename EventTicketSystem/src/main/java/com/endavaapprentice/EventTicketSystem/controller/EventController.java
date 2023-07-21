package com.endavaapprentice.EventTicketSystem.controller;

import com.endavaapprentice.EventTicketSystem.domain.DTO.EventVenueEventTypeDTO;
import com.endavaapprentice.EventTicketSystem.service.EventService.EventServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    private EventServiceInterface eventService;

    public EventController(EventServiceInterface eventService){
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public List<EventVenueEventTypeDTO> getAllEventsByTypeAndVenue(@RequestParam(required = true) String venueID,
                                                                   @RequestParam(required = true) String eventType){
        Long venueIdConverted = Long.valueOf(venueID);
        return eventService.getAllEventsByTypeAndVenue(venueIdConverted, eventType);
    }

}
