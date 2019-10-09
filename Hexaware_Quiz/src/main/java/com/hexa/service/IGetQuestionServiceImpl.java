package com.hexa.service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.dao.IQuizDao;
import com.hexa.entity.Questions;
import com.hexa.entity.User;

@Service("quesService")
@Transactional
public class IGetQuestionServiceImpl implements IGetQuestionService {

	@Autowired
	private IQuizDao dao;

	@Override
	public Set<Integer> getQuestionNos() {
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		int qno = 0;
		while (set.size() < 5) {
			qno = random.nextInt(25) + 1;
			set.add(qno);
		}

		return set;
	}

	@Override
	public Map<Integer, Questions> generateQuestions() {
		Set<Integer> qnos = getQuestionNos();
		Map<Integer, Questions> map = dao.getQuestions(qnos);
		return map;
	}

	@Override
	public int evaluate(Map<Integer, Questions> qmap, Map<Integer, String> amap) {
		int count = 0;
		Questions ques = null;
		for (int qid : amap.keySet()) {
			ques = qmap.get(qid);
			if (ques.getOptAns().equals(amap.get(qid)))
				++count;
		}
		System.out.println("test scoreis" + count);
		return count;
	}
}
