package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Survey;

import java.util.List;

public interface SurveyService {
    public Survey saveSurvey(Survey survey);

    List<Survey> getAllSurveys();

    Survey getSurveyById(int surveyId);

    public void deleteSurveyById(int surveyId);
}
