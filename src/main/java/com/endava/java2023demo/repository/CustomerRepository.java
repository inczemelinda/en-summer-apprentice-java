package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findCustomersById(Integer id);
    List<Customer> findAll();
}