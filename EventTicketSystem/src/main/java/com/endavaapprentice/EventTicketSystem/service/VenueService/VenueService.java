package com.endavaapprentice.EventTicketSystem.service.VenueService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;
import com.endavaapprentice.EventTicketSystem.repository.VenueRepository.VenueRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService implements VenueServiceInterface{

    private VenueRepositoryInterface venueRepository;

    public VenueService(VenueRepositoryInterface venueRepository){
        this.venueRepository = venueRepository;
    }

    @Override
    public List<Venue> getAllVenues(){
        return this.venueRepository.findAll();
    }

    @Override
    public Venue getVenueByID(Long venueID){
        return this.venueRepository.findById(venueID).get();
    }
}
