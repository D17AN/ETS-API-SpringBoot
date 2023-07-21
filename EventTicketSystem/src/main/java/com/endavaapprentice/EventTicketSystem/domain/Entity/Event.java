package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "[Event]")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventID")
    private Long eventID;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "venueID", referencedColumnName = "venueID")
    private Venue venue;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "eventTypeID", referencedColumnName = "eventTypeID")
    private EventType eventType;

    @Column(name = "eventDescription")
    private String eventDescription;

    @NotBlank(message = "The event must have a name!")
    @Column(name = "eventName")
    private String eventName;

    @Column(name = "eventImageURL")
    private String eventImageURL;

    @DateTimeFormat
    @Column(name = "startDate")
    private LocalDateTime startDate;

    @DateTimeFormat
    @Column(name = "endDate")
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<TicketCategory> ticketsCategoryList;
}
