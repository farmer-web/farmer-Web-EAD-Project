package com.example.farmer_web.repository;

import com.example.farmer_web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
