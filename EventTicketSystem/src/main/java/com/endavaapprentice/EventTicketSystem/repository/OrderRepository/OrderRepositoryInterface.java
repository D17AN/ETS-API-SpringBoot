package com.endavaapprentice.EventTicketSystem.repository.OrderRepository;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryInterface extends JpaRepository<Order, Long> {
}
