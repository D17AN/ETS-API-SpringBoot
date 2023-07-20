package com.endavaapprentice.EventTicketSystem.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationDTO {
    private String countryName;
    private String cityName;
    private String address;
}
