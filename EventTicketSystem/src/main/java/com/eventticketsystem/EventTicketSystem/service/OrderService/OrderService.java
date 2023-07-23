package com.eventticketsystem.EventTicketSystem.service.OrderService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderDTO;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Order;
import com.eventticketsystem.EventTicketSystem.repository.OrderRepository.OrderRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface{
    OrderRepositoryInterface orderRepository;

    OrderService(OrderRepositoryInterface orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDTO> getAllOrdersOfUser(Long userID) {
        return this.orderRepository.findAll().stream().filter(order -> {
            return order.getUser().getUserID().equals(userID);
        }).map(order -> {
            return new OrderDTO(order.getTicketCategory().getEvent().getEventID(),
                    order.getOrderedAt(),
                    order.getTicketCategory().getTicketCategoryID(),
                    order.getNumberOfTickets(),
                    order.getTotalPrice());
        }).toList();
    }

    @Override
    public void save(Order order){
        this.orderRepository.save(order);
    }
}
