package com.endavaapprentice.EventTicketSystem.repository.TicketCategoryRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepositoryInterface extends JpaRepository<TicketCategory, Long> {
}
