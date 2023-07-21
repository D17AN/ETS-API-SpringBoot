package com.endavaapprentice.EventTicketSystem.service.OrderCompositeService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import com.endavaapprentice.EventTicketSystem.service.OrderService.OrderServiceInterface;

public interface OrderCompositeServiceInterface extends OrderServiceInterface {
    OrderDTO addOrderToUser(Long userID, Long eventID, Long ticketCategoryID, Integer numberOfTickets);
}
