package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Survey;
import com.example.surveyapplication.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey getSurveyById(int surveyId) {
        return surveyRepository.findById(surveyId).orElse(null);
    }

    @Override
    public void deleteSurveyById(int surveyId) {
        surveyRepository.deleteById(surveyId);
    }
}
