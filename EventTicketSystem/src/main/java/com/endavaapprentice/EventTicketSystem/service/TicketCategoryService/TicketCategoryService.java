package com.endavaapprentice.EventTicketSystem.service.TicketCategoryService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.TicketCategory;
import com.endavaapprentice.EventTicketSystem.repository.TicketCategoryRepository.TicketCategoryRepositoryInterface;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TicketCategoryService implements TicketCategoryServiceInterface{

    private TicketCategoryRepositoryInterface ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepositoryInterface ticketCategoryRepository){
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public Collection<TicketCategory> getAllTicketCategory(){
        return this.ticketCategoryRepository.findAll();
    }

    @Override
    public TicketCategory getTicketCategoryById(Long ticketCategoryId) {
        return this.ticketCategoryRepository.findById(ticketCategoryId).get();
    }
}
