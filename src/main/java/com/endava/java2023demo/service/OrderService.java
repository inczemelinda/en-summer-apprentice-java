package com.endava.java2023demo.service;

import com.endava.java2023demo.DTO.OrdersDTO;
import com.endava.java2023demo.DTO.orderRequest;
import com.endava.java2023demo.model.Customer;
import com.endava.java2023demo.model.Orders;
import com.endava.java2023demo.model.TicketCategory;
import com.endava.java2023demo.repository.CustomerRepository;
import com.endava.java2023demo.repository.OrderRepository;
import com.endava.java2023demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    //GET

    public List<OrdersDTO> getOrdersById(Integer id) {
        List<Orders> ordersList = orderRepository.findOrdersById(id);
        List<OrdersDTO> ordersDTOList = new ArrayList<>();
        for (Orders orders : ordersList) {
            OrdersDTO ordersDTO = new OrdersDTO();
            ordersDTO.setEventID(orders.getId());
            ordersDTO.setOrderedAt(orders.getOrderedAt());
            ordersDTO.setTicketCategoryID(orders.getTicketCategory().getId());
            ordersDTO.setNumberOfTickets(orders.getNumberOfTickets());
            ordersDTO.setTotalPrice(orders.getTotalPrice());
            ordersDTOList.add(ordersDTO);
        }
        return ordersDTOList;
    }

    //POST

    public OrdersDTO createOrder(Integer customerId, orderRequest orderRequest) {
        Integer eventId = orderRequest.getEventID();
        Integer ticketCategoryId = orderRequest.getTicketCategoryID();
        Integer numberOfTickets = orderRequest.getNumberOfTickets();
        LocalDateTime timeStamp = LocalDateTime.now();

        Optional<TicketCategory> ticketsCategory = ticketCategoryRepository.findById(ticketCategoryId);
        if (ticketsCategory.isEmpty()) {
            throw new IllegalArgumentException("Ticket category not found");
        }
        TicketCategory ticketCategory = ticketsCategory.get();

        double totalPrice = ticketCategory.getPrice() * numberOfTickets;

        Orders newOrder = new Orders();
        newOrder.setOrderedAt(timeStamp);
        newOrder.setTicketCategory(ticketCategory);
        newOrder.setNumberOfTickets(numberOfTickets);
        newOrder.setTotalPrice(totalPrice);

        Customer customer = customerRepository.findById(customerId).orElse(null);
        if (customer == null) {
            throw new IllegalArgumentException("Customer not found");
        }

        newOrder.setCustomer(customer);
        newOrder = orderRepository.save(newOrder);

        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setEventID(eventId);
        ordersDTO.setOrderedAt(newOrder.getOrderedAt());
        ordersDTO.setTicketCategoryID(newOrder.getTicketCategory().getId());
        ordersDTO.setNumberOfTickets(newOrder.getNumberOfTickets());
        ordersDTO.setTotalPrice(newOrder.getTotalPrice());

        return ordersDTO;
    }
}