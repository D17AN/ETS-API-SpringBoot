package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
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

    public Location(Long locationID, String countryName,
                    String cityName, String address,
                    Venue venue) {
        this.locationID = locationID;
        this.countryName = countryName;
        this.cityName = cityName;
        this.address = address;
        this.venue = venue;
    }

    public Location() {
    }

    public Long getLocationID() {
        return locationID;
    }

    public void setLocationID(Long locationID) {
        this.locationID = locationID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationID=" + locationID +
                ", countryName='" + countryName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", address='" + address + '\'' +
                ", venue=" + venue +
                '}';
    }
}
