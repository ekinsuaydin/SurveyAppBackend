package com.example.surveyapplication.repository;

import com.example.surveyapplication.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Integer> {
}
