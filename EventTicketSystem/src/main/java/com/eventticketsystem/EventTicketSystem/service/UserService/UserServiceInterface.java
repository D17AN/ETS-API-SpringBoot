package com.eventticketsystem.EventTicketSystem.service.UserService;

import com.eventticketsystem.EventTicketSystem.domain.Entity.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserByID(Long userID);
}

