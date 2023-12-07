package com.example.mentorstudentassignment.Controller;

import com.example.mentorstudentassignment.Model.RecommendStudentModel;
import com.example.mentorstudentassignment.Repository.RecommendStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/recommendations")
public class RecommendStudentController {

    @Autowired
    private RecommendStudentRepository recommendStudentRepository;

    @PostMapping
    public RecommendStudentModel addRecommendation(@RequestBody RecommendStudentModel recommendation) {

        return recommendStudentRepository.save(recommendation);
    }

    @GetMapping("/{recommendationId}")
    public ResponseEntity<RecommendStudentModel> getRecommendationById(@PathVariable Long recommendationId) {
        Optional<RecommendStudentModel> recommendation = recommendStudentRepository.findById(recommendationId);
        return recommendation.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
