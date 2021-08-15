package com.bjoernkw.sleuthzipkinexample.orderservice.order;

import com.bjoernkw.sleuthzipkinexample.orderservice.customer.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    @Value("${customer.service.url}")
    private String customerServiceURL;

    private final RestTemplate restTemplate;

    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OrderDTO placeOrder(String orderID, String customerID) {
        LOGGER.info("Placing order {} for customer {} ", orderID, customerID);

        ResponseEntity<CustomerDTO> customerDTOResponseEntity
                = restTemplate.getForEntity(customerServiceURL + "/" + customerID, CustomerDTO.class);

        return new OrderDTO(
                orderID,
                Objects.requireNonNull(customerDTOResponseEntity.getBody()).getCustomerID()
        );
    }
}
