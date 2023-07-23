package com.eventticketsystem.EventTicketSystem.repository.EventRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepositoryInterface extends JpaRepository<Event, Long>{
}
