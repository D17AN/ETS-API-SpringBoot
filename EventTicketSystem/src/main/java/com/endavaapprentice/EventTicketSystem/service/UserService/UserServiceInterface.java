package com.endavaapprentice.EventTicketSystem.service.UserService;

import com.endavaapprentice.EventTicketSystem.domain.Entity.User;

import java.util.Collection;

public interface UserServiceInterface {
    Collection<User> getAllUser();
    User getUserById(Long userId);
}
