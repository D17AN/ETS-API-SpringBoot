package com.eventticketsystem.EventTicketSystem.service.LocationService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Location;

import java.util.Collection;

public interface LocationServiceInterface {
    Collection<Location> getAllLocations();
    Location getLocationByID(Long locationID);
}
