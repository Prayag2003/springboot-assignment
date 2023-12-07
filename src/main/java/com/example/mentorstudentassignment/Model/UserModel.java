package com.example.mentorstudentassignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class UserModel {

    @Id
    @GeneratedValue()
    private Long id;
    private String username;

    public UserModel(){
    }

    public UserModel(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserModel(Long id){
        this.id = id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
