package com.eventticketsystem.EventTicketSystem.service.OrderService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderDTO;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<OrderDTO> getAllOrdersOfUser(Long userID);
    void save(Order order);
}
