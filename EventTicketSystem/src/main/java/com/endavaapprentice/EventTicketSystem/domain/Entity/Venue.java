package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venueID")
    private Long venueID;

    @NotNull(message = "The venue must have a location!")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationID", referencedColumnName = "locationID")
    private Location location;

    @NotBlank(message = "The location must have a type!")
    @Column(name = "type")
    private String type;

    @Positive(message = "The capacity must be a positive integer!")
    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "venue", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Event> eventsList;
}
