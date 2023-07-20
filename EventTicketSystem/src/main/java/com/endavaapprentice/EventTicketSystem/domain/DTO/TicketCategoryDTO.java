package com.endavaapprentice.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketCategoryDTO {
    private Long ticketCategoryId;
    private String ticketType;
    private BigDecimal price;
}
