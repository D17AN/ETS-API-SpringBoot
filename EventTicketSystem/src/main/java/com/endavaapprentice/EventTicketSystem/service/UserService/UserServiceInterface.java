package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.DTO.OrderDTO;
import com.endavaapprentice.EventTicketSystem.domain.Entity.User;

import java.util.Collection;
import java.util.List;

public interface UserServiceInterface {
    Collection<User> getAllUser();
    User getUserById(Long userId);
    List<OrderDTO> getAllOrdersOfUser(Long userID);
}
