package com.example.mentorstudentassignment.Repository;

import com.example.mentorstudentassignment.Model.RecommendStudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendStudentRepository extends JpaRepository<RecommendStudentModel, Long> {
}
