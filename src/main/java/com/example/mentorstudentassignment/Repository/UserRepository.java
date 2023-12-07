package com.example.mentorstudentassignment.Repository;


import com.example.mentorstudentassignment.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
