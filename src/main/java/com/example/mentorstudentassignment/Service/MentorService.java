package com.example.mentorstudentassignment.Service;

import com.example.mentorstudentassignment.Model.MentorModel;
import com.example.mentorstudentassignment.Repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    public void createMentor(MentorModel mentor) {
        mentorRepository.save(mentor);
    }

    public MentorModel findById(int mentorId) {
        return mentorRepository.findById(mentorId).orElse(null);
    }
}
