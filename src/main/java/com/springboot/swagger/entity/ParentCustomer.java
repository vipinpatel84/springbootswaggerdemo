package com.springboot.swagger.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
//@IdClass(com.springboot.swagger.model.ParentCustomer.class)
public class ParentCustomer {
    //private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private UUID id;
    @Id
    //(name="emailAddress")
    private String emailAddress;

    //(name="password")
    private String password;

    //(name="firstName")
    private String firstName;

    //(name="lastName")
    private String lastName;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ParentCustomer{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
