package com.bjoernkw.sleuthzipkinexample.orderservice.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(OrderController.REQUEST_URL)
public class OrderController {

    static final String REQUEST_URL = "/";

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder() {
        LOGGER.info("HTTP request for placing a new order");

        return orderService.placeOrder("1", "1");
    }
}
