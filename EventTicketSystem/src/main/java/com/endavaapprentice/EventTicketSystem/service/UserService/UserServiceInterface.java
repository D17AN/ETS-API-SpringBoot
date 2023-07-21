package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserByID(Long userID);
    List<OrderDTO> getAllOrdersOfUser(Long userID);
}

