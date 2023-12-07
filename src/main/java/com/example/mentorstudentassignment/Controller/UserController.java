package com.example.mentorstudentassignment.Controller;

import com.example.mentorstudentassignment.Model.UserModel;
import com.example.mentorstudentassignment.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long userId) {
        Optional<UserModel> user = userRepository.findById(userId);
        return user.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
