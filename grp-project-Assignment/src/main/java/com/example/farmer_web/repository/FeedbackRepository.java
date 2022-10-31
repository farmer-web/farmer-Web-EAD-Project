package com.example.farmer_web.repository;

import com.example.farmer_web.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
    Feedback findByDate(Date date);
}
