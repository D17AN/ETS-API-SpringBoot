package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "[EventType]")
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventTypeID")
    private Long eventTypeID;

    @NotBlank(message = "The location type name cannot be empty!")
    @Column(name = "eventTypeName", unique = true)
    private String eventTypeName;

    @OneToMany(mappedBy = "eventType", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Event> eventsList;
}
