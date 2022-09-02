package com.example.surveyapplication.service;

import com.example.surveyapplication.model.Question;
import com.example.surveyapplication.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> saveAllQuestions(List<Question> questions) {
        return questionRepository.saveAll(questions);
    }

    @Override
    public Question getQuestionById(int questionId) {
        return questionRepository.findById(questionId).orElse(null);
    }

    @Override
    public void deleteQuestionById(int questionId) {
        questionRepository.deleteById(questionId);
    }

}

