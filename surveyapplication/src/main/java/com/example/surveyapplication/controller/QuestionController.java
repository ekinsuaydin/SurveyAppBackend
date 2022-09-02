package com.example.surveyapplication.controller;

import com.example.surveyapplication.model.Answer;
import com.example.surveyapplication.model.Question;
import com.example.surveyapplication.model.Survey;
import com.example.surveyapplication.service.AnswerService;
import com.example.surveyapplication.service.QuestionService;
import com.example.surveyapplication.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public String add(@RequestBody Question question){
        questionService.saveQuestion(question);
        return "Question saved";
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable("id") int id)
    {
        return questionService.getQuestionById(id);
    }

    @GetMapping("/getAll")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestions();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteQuestionById(@PathVariable("id") int id)
    {
        questionService.deleteQuestionById(id);
    }


}
