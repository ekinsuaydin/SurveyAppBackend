package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Question;
import com.example.surveyapplication.model.Survey;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    public Question saveQuestion(Question question);
    public List<Question> getAllQuestions();
    public List<Question> saveAllQuestions(List<Question> questions);
    Question getQuestionById(int questionId);
    public void deleteQuestionById(int questionId);


}
