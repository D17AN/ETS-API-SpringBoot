package com.eventticketsystem.EventTicketSystem.repository.UserRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
}
