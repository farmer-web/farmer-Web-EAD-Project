package com.example.farmer_web.controller;

import com.example.farmer_web.model.Feedback;
import com.example.farmer_web.repository.FeedbackRepository;
import com.example.farmer_web.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FeedbackController {
    private FeedbackRepository feedbackRepo;

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/addFeedback")
    public String addFeedback(
                              @RequestParam("name") String name,
                              @RequestParam("mobileNo") String mobileNo,
                              @RequestParam("message") String message,
                              @RequestParam("email") String email){
        feedbackService.saveFeedback(name,mobileNo,message,email);
        return "Your Feedback iss added successfully";
    }

    @GetMapping("/feedback/{id}")
    public Feedback findFeedback(@PathVariable int id){
        return feedbackService.getFeedbackById(id);
    }
    @GetMapping("/feedbacktList")
    public List<Feedback> findAllFeedbacks() {

        return feedbackService.getAllFeedback();
    }

    @DeleteMapping("/deleteFeedback/{id}")
    public String deleteFeedback(@PathVariable int id) {
        return feedbackService.deleteFeedback(id);
    }

    }
