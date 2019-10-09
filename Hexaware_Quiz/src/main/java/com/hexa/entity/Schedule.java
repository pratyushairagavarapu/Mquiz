package com.hexa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@DynamicUpdate(true)
@DynamicInsert(true)
@Table(name="quiz_schedule")
public class Schedule {

	
	@Id
	@GeneratedValue
	@Column(name="sch_id", nullable=false)
	private int schId;
	
	@ManyToOne
	@JoinColumn(name = "us_id", referencedColumnName = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "ex_id", referencedColumnName = "exam_id")
	private Exam exam;
	
	@Column(name="exam_time")
	private LocalDate eDate;
	
	@Column(name="e_active")
	private int active;
	
	@Column(name="e_score")
	private int score;
	
	

	public Schedule() {
		
	}

	public Schedule(int schId, LocalDate eDate, int active, int score) {
		super();
		this.schId = schId;
		this.eDate = eDate;
		this.active = active;
		this.score = score;
	}

	public int getSchId() {
		return schId;
	}

	public void setSchId(int schId) {
		this.schId = schId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public LocalDate geteDate() {
		return eDate;
	}

	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		
		return "Schedule [schId=" + schId + ", eDate=" + eDate + ", active=" + active + ", score=" + score + " " + user.getUserId()+" "+exam.getExamName()  +"]";
	}

	


	
	
	
}


