package com.endava.java2023demo.repository;

import com.endava.java2023demo.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    List<TicketCategory> findTicketCategoriesById(Integer id);
    List<TicketCategory> findAll();
}