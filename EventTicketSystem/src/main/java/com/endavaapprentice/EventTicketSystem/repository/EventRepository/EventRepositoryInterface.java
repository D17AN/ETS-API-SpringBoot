package com.endavaapprentice.EventTicketSystem.repository.EventRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepositoryInterface extends JpaRepository<Event, Long>{
}
