package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.validation.constraints.*;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Check;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "[User]")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Long userID;

    @Column(name = "userName")
    @NotBlank(message = "The user must have a name!")
    private String userName;

    @Column(name = "userEmail")
    @Email(message = "The user must be valid!")
    private String userEmail;

    @Column(name = "userRole")
    @Pattern(regexp = "^(admin|customer)$",
            message = "Invalid role: user role must be 'customer' or 'admin'!")
    private String userRole;

    @Column(name = "salt")
    @Size(min = 16, max = 16,
            message = "The salt must be a 16 characters generated string!")
    private String salt;

    @Column(name = "hashedPassword")
    @NotBlank(message = "The password cannot be empty!")
    private String hashedPassword;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Order> ordersList;
}
