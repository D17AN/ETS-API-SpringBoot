package com.eventticketsystem.EventTicketSystem.service.TicketCategoryService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.TicketCategory;

import java.util.List;

public interface TicketCategoryServiceInterface {
    List<TicketCategory> getAllTicketCategories();
    TicketCategory getTicketCategoryByID(Long ticketCategoryID);
}
