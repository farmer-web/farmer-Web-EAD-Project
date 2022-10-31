package com.example.farmer_web.service;

import com.example.farmer_web.model.Feedback;
import com.example.farmer_web.model.Product;
import com.example.farmer_web.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepo2;

    public void saveFeedback(String name, String mobileNo, String message, String email) {
        Feedback feedback = new Feedback();
        feedback.setName(name);
        feedback.setMobileNo(mobileNo);
        feedback.setMessage(message);
        feedback.setEmail(email);
        feedback.setDate(new Date());

        feedbackRepo2.save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return feedbackRepo2.findAll();
    }

    public Feedback getFeedbackById(int id) {
        return feedbackRepo2.findById(id).orElse(null);
    }

    public String deleteFeedback(int id) {
        feedbackRepo2.deleteById(id);
        return "Feedback Removed";
    }



}
