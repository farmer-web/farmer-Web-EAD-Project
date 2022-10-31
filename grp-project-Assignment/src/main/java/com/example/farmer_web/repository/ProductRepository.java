package com.example.farmer_web.repository;

import com.example.farmer_web.model.Feedback;
import com.example.farmer_web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
