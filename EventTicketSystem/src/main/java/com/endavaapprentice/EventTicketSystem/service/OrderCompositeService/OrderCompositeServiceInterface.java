package com.endavaapprentice.EventTicketSystem.service.OrderCompositeService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderRequestBody;
import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import com.endavaapprentice.EventTicketSystem.service.OrderService.OrderServiceInterface;

import java.util.List;

public interface OrderCompositeServiceInterface {
    OrderDTO addOrderToUser(Long userID, OrderRequestBody orderRequestBody);
    List<OrderDTO> getAllOrdersOfUser(Long userID);
    void save(Order order);
}
