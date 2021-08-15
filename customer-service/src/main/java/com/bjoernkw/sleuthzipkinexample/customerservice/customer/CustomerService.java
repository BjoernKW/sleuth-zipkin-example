package com.bjoernkw.sleuthzipkinexample.customerservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public Customer getCustomer(String customerID) {
        LOGGER.info("Getting customer: {}", customerID);

        return new Customer(customerID);
    }
}
