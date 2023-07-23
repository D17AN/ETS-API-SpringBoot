package com.eventticketsystem.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketCategoryDTO {
    private Long ticketCategoryID;
    private String ticketType;
    private BigDecimal price;
}
