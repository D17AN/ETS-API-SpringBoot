package com.endavaapprentice.EventTicketSystem.repository.LocationRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepositoryInterface extends JpaRepository<Location, Long> {
}
