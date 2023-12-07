package com.example.mentorstudentassignment.Service;

import com.example.mentorstudentassignment.Model.MentorModel;
import com.example.mentorstudentassignment.Model.ReviewModel;
import com.example.mentorstudentassignment.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MentorService mentorService;

    public ReviewModel addRatingForMentor(int mentorId, ReviewModel review) {

        MentorModel mentor = mentorService.findById(mentorId);
        if (mentor != null) {
            review.setMentor(mentor);
            return reviewRepository.save(review);
        } else {
            return null; // Mentor not found
        }
    }
}
