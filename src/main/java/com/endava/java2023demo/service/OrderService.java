package com.endava.java2023demo.service;

import com.endava.java2023demo.model.Orders;
import com.endava.java2023demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Method to get all orders
    public Iterable<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    // Method to create an order
    public Orders createOrder(Integer eventID, Integer ticketCategoryID, Integer numberOfTickets) {
        // Assuming customerID is hardcoded in the backend (e.g., customerID = 1)
        Integer customerID = 1;

        // Calculate the total price based on the number of tickets and ticket price
        // Retrieve ticket price from the TicketCategory table using ticketCategoryId

        // Create the order object and save it to the database
        Orders order = new Orders();
        // Save the order to the database
        return orderRepository.save(order);
    }
}