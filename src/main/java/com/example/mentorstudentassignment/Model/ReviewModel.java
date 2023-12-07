package com.example.mentorstudentassignment.Model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private int rating;

    @ManyToOne
    private MentorModel mentor;

    public ReviewModel(String s, int id, UserModel user1, MentorModel mentor1) {

    }

    public ReviewModel() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMentor(MentorModel mentor) {
        this.mentor = mentor;
    }
}


