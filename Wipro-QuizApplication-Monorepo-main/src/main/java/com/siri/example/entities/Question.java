package com.siri.example.entities;

import com.siri.example.enums.Category;
import com.siri.example.enums.DifficultyLevel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long QuestionID;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctAnswer;
	private Category category;
	private DifficultyLevel difficultyLevel;
}
