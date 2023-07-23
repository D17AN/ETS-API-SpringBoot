package com.eventticketsystem.EventTicketSystem.service.OrderCompositeService;

import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderDTO;
import com.eventticketsystem.EventTicketSystem.domain.DTO.OrderRequestBody;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Event;
import com.eventticketsystem.EventTicketSystem.domain.Entity.Order;
import com.eventticketsystem.EventTicketSystem.domain.Entity.TicketCategory;
import com.eventticketsystem.EventTicketSystem.domain.Entity.User;

import com.eventticketsystem.EventTicketSystem.service.EventService.EventServiceInterface;
import com.eventticketsystem.EventTicketSystem.service.OrderService.OrderServiceInterface;
import com.eventticketsystem.EventTicketSystem.service.TicketCategoryService.TicketCategoryServiceInterface;
import com.eventticketsystem.EventTicketSystem.service.UserService.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderCompositeService implements OrderCompositeServiceInterface{
    OrderServiceInterface orderService;
    UserServiceInterface userService;
    TicketCategoryServiceInterface ticketCategoryService;
    EventServiceInterface eventService;

    OrderCompositeService(OrderServiceInterface orderService, UserServiceInterface userService,
        TicketCategoryServiceInterface ticketCategoryService, EventServiceInterface eventService){
        this.orderService = orderService;
        this.userService = userService;
        this.ticketCategoryService = ticketCategoryService;
        this.eventService = eventService;
    }

    @Override
    public OrderDTO addOrderToUser(Long userID, OrderRequestBody orderRequestBody) {

        User user = this.userService.getUserByID(userID);
        Event event = this.eventService.getEventByID(orderRequestBody.getEventID());
        TicketCategory ticketCategory = this.ticketCategoryService.getTicketCategoryByID(orderRequestBody.getTicketCategoryID());
        BigDecimal ticketPrice = ticketCategory.getPrice();
        Integer numberOfTickets = orderRequestBody.getNumberOfTickets();
        BigDecimal ticketsTotalPrice = ticketPrice.multiply(BigDecimal.valueOf(numberOfTickets));
        Order order = new Order(
                null, user,
                ticketCategory, LocalDateTime.now(),
                numberOfTickets, ticketsTotalPrice
        );

        this.save(order);

        return new OrderDTO(
                event.getEventID(),
                order.getOrderedAt(),
                ticketCategory.getTicketCategoryID(),
                order.getNumberOfTickets(),
                order.getTotalPrice()
        );
    }

    public List<OrderDTO> getAllOrdersOfUser(Long userID) {
        return orderService.getAllOrdersOfUser(userID);
    }

    public void save(Order order) {
        this.orderService.save(order);
    }
}
