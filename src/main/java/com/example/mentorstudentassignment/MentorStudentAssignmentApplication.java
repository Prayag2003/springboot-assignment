package com.example.mentorstudentassignment;

import com.example.mentorstudentassignment.Model.MentorModel;
import com.example.mentorstudentassignment.Model.ReviewModel;
import com.example.mentorstudentassignment.Model.UserModel;
import com.example.mentorstudentassignment.Service.MentorService;
import com.example.mentorstudentassignment.Service.RatingService;
import com.example.mentorstudentassignment.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MentorStudentAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationContext.class, args);

		UserService userService = context.getBean(UserService.class);
		MentorService mentorService = context.getBean(MentorService.class);
		RatingService ratingService = context.getBean(RatingService.class);

		UserModel user = new UserModel();
		user.setUsername("JohnDoe");
		userService.createUser(user);

		MentorModel mentor = new MentorModel();
		mentor.setName("MentorName");
		mentorService.createMentor(mentor);

		int mentorId = 1;

		ReviewModel review = new ReviewModel();
		review.setComment("Great mentor!");
		review.setRating(5);
		ratingService.addRatingForMentor(mentorId, review);

		context.close();
	}
}
