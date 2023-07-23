package com.eventticketsystem.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestBody {
    private Long eventID;
    private Long ticketCategoryID;
    private Integer numberOfTickets;
}
