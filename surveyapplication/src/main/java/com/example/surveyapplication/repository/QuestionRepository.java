package com.example.surveyapplication.repository;

import com.example.surveyapplication.model.Answer;
import com.example.surveyapplication.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
