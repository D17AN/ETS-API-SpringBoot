package com.endavaapprentice.EventTicketSystem.service.LocationService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Location;

import java.util.Collection;

public interface LocationServiceInterface {
    Collection<Location> getAllLocations();
    Location getLocationByID(Long locationID);
}
