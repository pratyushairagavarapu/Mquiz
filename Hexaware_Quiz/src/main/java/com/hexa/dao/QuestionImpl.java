package com.hexa.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.entity.Questions;
import com.hexa.entity.Schedule;
import com.hexa.entity.User;

@Repository("mydao")
@Transactional
public class QuestionImpl implements IQuizDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Questions> getQuestions() {

		Query qry = em.createQuery("from Questions ");
		System.out.println("successfully executed");
		return qry.getResultList();

	}

	@Override
	public List<Questions> getQuestionByExamId(int examId) {
		Query qry = em.createQuery("from Questions where question_id =:quesId");
		qry.setParameter("quesId", "question_id");
		return qry.getResultList();

	}

	@Override
	public Map<Integer, Questions> getQuestions(Set<Integer> qnosSet) {
		Query qry = em.createQuery("FROM Questions  WHERE quesId IN (:qnos)");
		qry.setParameter("qnos", qnosSet);
		List<Questions> lst = qry.getResultList();
		Map<Integer, Questions> map = (Map<Integer, Questions>) lst.stream()
				.collect(Collectors.toMap(q -> q.getQuesId(), q -> q));
		return map;
	}

	@Override
	public String updateSchedule(int i, int count) {
		Query qry = em.createQuery("UPDATE Schedule set score=:count, active=0 where us_id=:i");
		qry.setParameter("i", i);
		qry.setParameter("count", count);
		qry.executeUpdate();
		return "schedule updated";
	}

	@Override
	public User getUserLogin(int id, String pwd) {
		Query qry = em.createQuery("from User where userId=:uid and userPass =:pwd");
		qry.setParameter("uid", id);
		qry.setParameter("pwd", pwd);
		return (User) qry.getSingleResult();
	}

	@Override
	public List<Schedule> getHistory(int id) {
		Query qry = em.createQuery("FROM Schedule s inner join fetch s.user u  WHERE u.userId=:id");
		qry.setParameter("id", id);
		List<Schedule> resultList = qry.getResultList();
		resultList.forEach(System.out::println);
		return resultList;

	}

}
