package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="[Location]")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locationID")
    private Long locationID;

    @NotBlank(message = "The country name cannot be empty!")
    @Column(name = "countryName")
    private String countryName;

    @NotBlank(message = "The city name cannot be empty!")
    @Column(name = "cityName")
    private String cityName;

    @NotNull(message = "The address cannot be empty!")
    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "location", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Venue venue;
}
