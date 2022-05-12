package com.springboot.swagger.model;

public class ChildCustomer {

    private String firstName;
    private String lastName;
    private String planInfo;
    private String referenceCustomerNumber;
    private String emailAddress;
    private String companyName;

    private ParentCustomer parentCustomer;

    public ParentCustomer getParentCustomer() {
        return parentCustomer;
    }

    public void setParentCustomer(ParentCustomer parentCustomer) {
        this.parentCustomer = parentCustomer;
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
