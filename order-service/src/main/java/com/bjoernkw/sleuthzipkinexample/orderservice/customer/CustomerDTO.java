package com.bjoernkw.sleuthzipkinexample.orderservice.customer;

public class CustomerDTO {

    private String customerID;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
