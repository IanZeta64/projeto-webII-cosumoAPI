package com.example.projectstore.api.repositories;

import com.example.projectstore.api.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
