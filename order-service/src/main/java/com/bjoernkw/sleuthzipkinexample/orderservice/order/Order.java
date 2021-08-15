package com.bjoernkw.sleuthzipkinexample.orderservice.order;

public class Order {

    private String orderID;

    private String customerID;

    public Order(String orderID, String customerID) {
        this.orderID = orderID;
        this.customerID = customerID;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerID() {
        return customerID;
    }
}
