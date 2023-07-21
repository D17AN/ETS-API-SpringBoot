package com.endavaapprentice.EventTicketSystem.service.TicketCategoryService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;

import java.util.List;

public interface TicketCategoryServiceInterface {
    List<TicketCategory> getAllTicketCategories();
    TicketCategory getTicketCategoryByID(Long ticketCategoryID);
}
