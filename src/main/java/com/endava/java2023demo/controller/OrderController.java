package com.endava.java2023demo.controller;

import com.endava.java2023demo.model.Orders;
import com.endava.java2023demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    // Endpoint for GET /orders (customerId is hardcoded in the backend)
    @GetMapping
    public Iterable<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }
    // Endpoint for POST /orders (customerId is hardcoded in the backend)
    @PostMapping
    public ResponseEntity<Orders> createOrder(@RequestBody OrderRequest orderRequest) {
        Orders order = orderService.createOrder(orderRequest.getEventID(),
                orderRequest.getTicketCategoryID(), orderRequest.getNumberOfTickets());
        return ResponseEntity.ok(order);
    }
}
