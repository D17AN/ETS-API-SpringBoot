package com.endavaapprentice.EventTicketSystem.service.VenueService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;
import com.endavaapprentice.EventTicketSystem.repository.VenueRepository.VenueRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VenueService implements VenueServiceInterface{

    private VenueRepositoryInterface venueRepository;

    public VenueService(VenueRepositoryInterface venueRepository){
        this.venueRepository = venueRepository;
    }

    @Override
    public Collection<Venue> getAllVenue(){
        return this.venueRepository.findAll();
    }

    @Override
    public Venue getVenueById(Long venueId){
        return this.venueRepository.findById(venueId).get();
    }
}
