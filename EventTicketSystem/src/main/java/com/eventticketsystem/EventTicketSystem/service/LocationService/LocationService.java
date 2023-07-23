package com.eventticketsystem.EventTicketSystem.service.LocationService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Location;
import com.eventticketsystem.EventTicketSystem.repository.LocationRepository.LocationRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocationService implements LocationServiceInterface{

    private LocationRepositoryInterface locationRepository;

    LocationService(LocationRepositoryInterface locationRepository){
        this.locationRepository = locationRepository;
    }

    @Override
    public Collection<Location> getAllLocations(){
        return this.locationRepository.findAll();
    }

    @Override
    public Location getLocationByID(Long locationID){
        return this.locationRepository.getReferenceById(locationID);
    }
}
