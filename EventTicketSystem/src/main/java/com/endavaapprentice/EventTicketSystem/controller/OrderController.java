package com.endavaapprentice.EventTicketSystem.controller;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderRequestBody;
import com.endavaapprentice.EventTicketSystem.service.OrderCompositeService.OrderCompositeServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    OrderCompositeServiceInterface orderCompositeService;

    public OrderController(OrderCompositeServiceInterface orderCompositeService){
        this.orderCompositeService = orderCompositeService;
    }

    @GetMapping("/{userID}/orders")
    public List<OrderDTO> getAllOrdersOfUser(@PathVariable ("userID") Long userID){
        return this.orderCompositeService.getAllOrdersOfUser(userID);
    }

    @PostMapping("/{userID}/orders")
    public OrderDTO addOrderToUser(@PathVariable ("userID") Long userID, @RequestBody OrderRequestBody orderRequestBody){
        return this.orderCompositeService.addOrderToUser(userID, orderRequestBody);
    }
}
