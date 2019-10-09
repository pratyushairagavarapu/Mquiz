package com.hexa.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate(true)
@DynamicInsert(true)
@Table(name = "quiz_exam")
public class Exam {

	@Id
	@Column(name = "exam_id", nullable = false)
	private int examId;

	@Column(name = "exam_name", length = 25, nullable = false)
	private String examName;

	@OneToMany(mappedBy = "exams")
	private Set<Questions> questions;

	@OneToMany(mappedBy = "exam")
	private Set<Schedule> schedule;

	public Exam() {

	}

	public Exam(int examId, String examName) {
		super();
		this.examId = examId;
		this.examName = examName;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Set<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Questions> questions) {
		this.questions = questions;
	}

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + "]";
	}

}
