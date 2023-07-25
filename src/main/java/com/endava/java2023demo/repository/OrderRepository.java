package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findOrdersById(Integer id);
    List<Orders> findAll();
}