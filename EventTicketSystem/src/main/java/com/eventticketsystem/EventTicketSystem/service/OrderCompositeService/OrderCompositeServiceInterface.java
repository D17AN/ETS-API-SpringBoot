package com.eventticketsystem.EventTicketSystem.service.OrderCompositeService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderDTO;
import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderRequestBody;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Order;

import java.util.List;

public interface OrderCompositeServiceInterface {
    OrderDTO addOrderToUser(Long userID, OrderRequestBody orderRequestBody);
    List<OrderDTO> getAllOrdersOfUser(Long userID);
    void save(Order order);
}
