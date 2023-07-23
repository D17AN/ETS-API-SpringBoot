package com.eventticketsystem.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VenueDTO {
    private Long venueID;
    private String type;
    private Integer capacity;
    private LocationDTO location;
}
