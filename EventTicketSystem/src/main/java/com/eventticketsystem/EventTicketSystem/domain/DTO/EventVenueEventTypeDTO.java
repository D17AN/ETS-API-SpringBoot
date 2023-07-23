package com.eventticketsystem.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventVenueEventTypeDTO {
    private Long eventID;
    private VenueDTO venue;
    private String eventType;
    private String eventDescription;
    private String eventName;
    private String eventImageURL;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<TicketCategoryDTO> ticketCategoryDTOList;
}
