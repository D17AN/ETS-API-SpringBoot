package com.eventticketsystem.EventTicketSystem.repository.LocationRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepositoryInterface extends JpaRepository<Location, Long> {
}
