package com.example.mentorstudentassignment.Service;

import com.example.mentorstudentassignment.Model.UserModel;
import com.example.mentorstudentassignment.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

}
