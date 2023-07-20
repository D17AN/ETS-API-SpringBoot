package com.endavaapprentice.EventTicketSystem.domain.DTO;

import com.endavaapprentice.EventTicketSystem.domain.Entity.Location;
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
