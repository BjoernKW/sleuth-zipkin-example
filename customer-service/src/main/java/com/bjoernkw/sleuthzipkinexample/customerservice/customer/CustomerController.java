package com.bjoernkw.sleuthzipkinexample.customerservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CustomerController.REQUEST_URL)
public class CustomerController {

    static final String REQUEST_URL = "/";

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public Customer getCustomer(@PathVariable String customerID) {
        LOGGER.info("HTTP request for customer: {}", customerID);

        return customerService.getCustomer(customerID);
    }
}
