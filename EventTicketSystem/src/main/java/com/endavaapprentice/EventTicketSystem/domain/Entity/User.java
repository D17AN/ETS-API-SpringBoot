package com.endavaapprentice.EventTicketSystem.domain.Entity;

import jakarta.validation.constraints.*;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import org.hibernate.annotations.Check;

import java.util.List;


@Entity
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

    public User(Long userID, String userName,
                String userEmail, String userRole,
                String salt, String hashedPassword,
                List<Order> ordersList) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userRole = userRole;
        this.salt = salt;
        this.hashedPassword = hashedPassword;
        this.ordersList = ordersList;
    }

    public User() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRole='" + userRole + '\'' +
                ", salt='" + salt + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
