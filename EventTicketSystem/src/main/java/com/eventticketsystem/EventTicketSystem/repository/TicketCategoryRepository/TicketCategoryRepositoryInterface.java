package com.eventticketsystem.EventTicketSystem.repository.TicketCategoryRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepositoryInterface extends JpaRepository<TicketCategory, Long> {
}
