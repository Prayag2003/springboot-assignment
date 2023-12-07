package com.example.mentorstudentassignment.Repository;

import com.example.mentorstudentassignment.Model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewModel, Long> {
}

