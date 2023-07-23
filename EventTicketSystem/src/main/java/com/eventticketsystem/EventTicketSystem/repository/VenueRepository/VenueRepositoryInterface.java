package com.eventticketsystem.EventTicketSystem.repository.VenueRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepositoryInterface extends JpaRepository<Venue, Long> {
}