package com.springboot.swagger.entity;

import javax.persistence.*;

@Entity
public class ChildCustomerEntity {

    private String firstName;
    private String lastName;
    private String planInfo;
    private String referenceCustomerNumber;
    @Id
    private String emailAddress;
    private String companyName;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name="customer_number")
    private ParentCustomerEntity parentCustomerEntity;

    public ParentCustomerEntity getParentCustomerEntity() {
        return parentCustomerEntity;
    }

    public void setParentCustomerEntity(ParentCustomerEntity parentCustomerEntity) {
        this.parentCustomerEntity = parentCustomerEntity;
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

    public String getPlanInfo() {
        return planInfo;
    }

    public void setPlanInfo(String planInfo) {
        this.planInfo = planInfo;
    }

    public String getReferenceCustomerNumber() {
        return referenceCustomerNumber;
    }

    public void setReferenceCustomerNumber(String referenceCustomerNumber) {
        this.referenceCustomerNumber = referenceCustomerNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
