package com.endavaapprentice.EventTicketSystem.service.VenueService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;
import com.endavaapprentice.EventTicketSystem.repository.VenueRepository.VenueRepositoryInterface;

import java.util.Collection;

public class VenueService {

    private VenueRepositoryInterface venueRepository;

    public VenueService(VenueRepositoryInterface venueRepository){
        this.venueRepository = venueRepository;
    }

    public Collection<Venue> getAllVenue(){
        return this.venueRepository.findAll();
    }

    public Venue getVenueById(Long venueId){
        return this.venueRepository.findById(venueId).get();
    }
}
