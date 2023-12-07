package com.example.mentorstudentassignment.Controller;

import com.example.mentorstudentassignment.Model.MentorModel;
import com.example.mentorstudentassignment.Repository.MentorRepository;
import com.example.mentorstudentassignment.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentors")
public class MentorController {

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping
    public MentorModel createMentor(@RequestBody MentorModel mentor) {
        return mentorRepository.save(mentor);
    }

    @GetMapping
    public List<MentorModel> getAllMentors() {
        return mentorRepository.findAll();
    }

    @GetMapping("/details")
    public List<MentorModel> getMentorDetailsByRating(@RequestParam int rating) {
        return null;
    }
}
