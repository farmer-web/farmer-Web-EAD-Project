package com.example.farmer_web.repository;

import com.example.farmer_web.model.POrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<POrder,Integer> {
}
