package com.eventticketsystem.EventTicketSystem.repository.OrderRepository;

import com.eventticketsystem.EventTicketSystem.domain.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryInterface extends JpaRepository<Order, Long> {
}
