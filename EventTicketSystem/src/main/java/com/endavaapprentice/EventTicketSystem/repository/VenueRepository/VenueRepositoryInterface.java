package com.endavaapprentice.EventTicketSystem.repository.VenueRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepositoryInterface extends JpaRepository<Venue, Long> {
}