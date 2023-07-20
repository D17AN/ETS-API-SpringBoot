package com.endavaapprentice.EventTicketSystem.service.TicketCategoryService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;

import java.util.Collection;

public interface TicketCategoryServiceInterface {
    Collection<TicketCategory> getAllTicketCategory();
    TicketCategory getTicketCategoryById(Long ticketCategoryId);
}
