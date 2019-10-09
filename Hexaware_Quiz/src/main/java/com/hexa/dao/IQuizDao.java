package com.hexa.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hexa.entity.Questions;
import com.hexa.entity.Schedule;
import com.hexa.entity.User;

public interface IQuizDao {

	public List<Questions> getQuestions();

	public List<Questions> getQuestionByExamId(int examId);

	public Map<Integer, Questions> getQuestions(Set<Integer> qnos);

	public String updateSchedule(int i, int count);

	public User getUserLogin(int id, String pwd);

	public List<Schedule> getHistory(int id);

}
