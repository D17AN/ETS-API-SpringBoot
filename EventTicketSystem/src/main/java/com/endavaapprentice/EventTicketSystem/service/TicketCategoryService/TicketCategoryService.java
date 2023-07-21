package com.endavaapprentice.EventTicketSystem.service.TicketCategoryService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;
import com.endavaapprentice.EventTicketSystem.repository.TicketCategoryRepository.TicketCategoryRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryService implements TicketCategoryServiceInterface{

    private TicketCategoryRepositoryInterface ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepositoryInterface ticketCategoryRepository){
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public List<TicketCategory> getAllTicketCategories(){
        return this.ticketCategoryRepository.findAll();
    }

    @Override
    public TicketCategory getTicketCategoryByID(Long ticketCategoryID) {
        return this.ticketCategoryRepository.findById(ticketCategoryID).get();
    }
}
