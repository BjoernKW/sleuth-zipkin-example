package com.bjoernkw.sleuthzipkinexample.orderservice.customer;

public class CustomerDTO {

    public String getCustomerID() {
        return customerID;
    }

    private String customerID;

    public CustomerDTO(String customerID) {
        this.customerID = customerID;
    }
}
