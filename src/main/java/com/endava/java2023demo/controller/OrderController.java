package com.endava.java2023demo.controller;

import com.endava.java2023demo.DTO.OrdersDTO;
import com.endava.java2023demo.DTO.orderRequest;
import com.endava.java2023demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class OrderController {
    Integer customerId = 1;
    @Autowired
    private OrderService orderService;
    @GetMapping("/api/orders")
    public List<OrdersDTO> getOrders() {
        List<OrdersDTO> orders = orderService.getOrdersById(customerId);
        return orders;
    }

    @PostMapping("/api/Orders")
    public ResponseEntity<OrdersDTO> createOrder(@RequestBody orderRequest orderRequest) {
        OrdersDTO orderDTO = orderService.createOrder(customerId, orderRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderDTO);
    }
}