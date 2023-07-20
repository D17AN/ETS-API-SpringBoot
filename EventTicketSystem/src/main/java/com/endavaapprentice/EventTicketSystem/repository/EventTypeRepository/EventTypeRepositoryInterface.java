package com.endavaapprentice.EventTicketSystem.repository.EventTypeRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepositoryInterface extends JpaRepository<EventType, Long> {
}
