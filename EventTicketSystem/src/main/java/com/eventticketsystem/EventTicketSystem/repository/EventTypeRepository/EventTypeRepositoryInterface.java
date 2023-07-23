package com.eventticketsystem.EventTicketSystem.repository.EventTypeRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepositoryInterface extends JpaRepository<EventType, Long> {
}
