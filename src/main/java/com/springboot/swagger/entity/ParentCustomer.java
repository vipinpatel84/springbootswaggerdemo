package com.springboot.swagger.entity;

//import org.springframework.data.annotation.Id;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

//@Entity
//@Table(name="parentCustomer")
public class ParentCustomer  implements Serializable {
    private static final long serialVersionUID = 1L;

//    @Id
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

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
}
