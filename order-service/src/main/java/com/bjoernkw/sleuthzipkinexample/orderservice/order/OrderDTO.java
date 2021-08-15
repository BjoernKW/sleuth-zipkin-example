package com.bjoernkw.sleuthzipkinexample.orderservice.order;

public class OrderDTO {

    private String orderID;

    private String customerID;

    public OrderDTO() {
    }

    public OrderDTO(String orderID, String customerID) {
        this.orderID = orderID;
        this.customerID = customerID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
