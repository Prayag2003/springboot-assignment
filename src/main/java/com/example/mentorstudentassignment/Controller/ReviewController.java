package com.example.mentorstudentassignment.Controller;

import com.example.mentorstudentassignment.Model.MentorModel;
import com.example.mentorstudentassignment.Model.ReviewModel;
import com.example.mentorstudentassignment.Repository.MentorRepository;
import com.example.mentorstudentassignment.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MentorRepository mentorRepository;


    @PostMapping("/mentor/{mentorId}")
    public ResponseEntity<ReviewModel> addReviewForMentor(@PathVariable int mentorId, @RequestBody ReviewModel review) {
        Optional<MentorModel> mentorOptional = mentorRepository.findById(mentorId);
        if (mentorOptional.isPresent()) {
            MentorModel mentor = mentorOptional.get();
            review.setMentor(mentor);
            return ResponseEntity.ok().body(reviewRepository.save(review));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
