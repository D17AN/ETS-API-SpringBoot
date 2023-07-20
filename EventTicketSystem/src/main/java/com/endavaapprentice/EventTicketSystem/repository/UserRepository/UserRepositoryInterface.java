package com.endavaapprentice.EventTicketSystem.repository.UserRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
}
