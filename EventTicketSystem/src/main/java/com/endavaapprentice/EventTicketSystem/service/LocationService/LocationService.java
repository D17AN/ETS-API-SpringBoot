package com.endavaapprentice.EventTicketSystem.service.LocationService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Location;
import com.endavaapprentice.EventTicketSystem.repository.LocationRepository.LocationRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocationService implements LocationServiceInterface{

    private LocationRepositoryInterface locationRepository;

    LocationService(LocationRepositoryInterface locationRepository){
        this.locationRepository = locationRepository;
    }

    public Collection<Location> getAllLocation(){
        return this.locationRepository.findAll();
    }

    public Location getLocationById(Long locationId){
        return this.locationRepository.getReferenceById(locationId);
    }
}
