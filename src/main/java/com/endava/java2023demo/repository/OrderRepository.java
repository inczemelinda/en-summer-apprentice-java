package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findByOrderIdAndTicketCategory(Integer venueID, String ticketCategory);
}