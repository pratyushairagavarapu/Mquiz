package com.hexa.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hexa.entity.Questions;

public interface IGetQuestionService {
	Set<Integer> getQuestionNos();

	Map<Integer, Questions> generateQuestions();

	int evaluate(Map<Integer, Questions> qmap, Map<Integer, String> amap);
}
