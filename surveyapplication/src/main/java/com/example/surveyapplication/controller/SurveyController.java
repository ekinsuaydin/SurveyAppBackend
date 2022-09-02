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
import java.util.Set;

@RestController
@RequestMapping("/survey")
@CrossOrigin
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public String add(@RequestBody Survey survey){
        surveyService.saveSurvey(survey);
        return "Survey saved";
    }

    @GetMapping("/getAll")
    public List<Survey> getAllSurvey() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("/{id}")
    public Survey getSurveyById(@PathVariable("id") int id)
    {
        return surveyService.getSurveyById(id);
    }

    @PutMapping("/{surveyId}/question/{questionId}")
    public Survey createSurvey(
            @PathVariable int questionId,
            @PathVariable int surveyId
    ) {
        Question question = questionService.getQuestionById(questionId);
        Survey survey = surveyService.getSurveyById(surveyId);
        return surveyService.saveSurvey(survey);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSurveyById(@PathVariable("id") int id)
    {
        surveyService.deleteSurveyById(id);
    }

    @PutMapping("/edit/{id}")
    public Survey editSurveyById(@PathVariable("id") int id,
                                 @RequestBody Survey editSurvey) {
        Survey survey = surveyService.getSurveyById(id);
        survey.setTitle(editSurvey.getTitle());
        if(editSurvey.getQuestions() != null) {
            editSurvey.getQuestions().forEach(question -> {
                survey.getQuestions().add(question);
            });
        }
        return surveyService.saveSurvey(survey);
    }


}



