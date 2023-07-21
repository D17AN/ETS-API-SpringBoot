package com.endavaapprentice.EventTicketSystem.service.OrderService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import com.endavaapprentice.EventTicketSystem.repository.OrderRepository.OrderRepositoryInterface;

import java.util.List;

public interface OrderServiceInterface {
    List<OrderDTO> getAllOrdersOfUser(Long userID);
    void save(Order order);
}
