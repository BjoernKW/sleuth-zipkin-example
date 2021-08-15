package com.bjoernkw.sleuthzipkinexample.customerservice.customer;

public class Customer {

    private String customerID;

    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }
}
