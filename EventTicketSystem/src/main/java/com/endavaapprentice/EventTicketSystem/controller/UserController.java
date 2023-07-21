package com.endavaapprentice.EventTicketSystem.controller;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.service.UserService.UserServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    UserServiceInterface userService;

    public UserController(UserServiceInterface userService){
        this.userService = userService;
    }

    @GetMapping("/{userID}/orders")
    public List<OrderDTO> getAllOrdersOfUser(@PathVariable ("userID") Long userID){
        return this.userService.getAllOrdersOfUser(userID);
    }
}
