package com.endavaapprentice.EventTicketSystem.domain.DTO;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long eventID;
    private LocalDateTime orderedAt;
    private Long ticketCategoryID;
    private BigDecimal totalPrice;
}
