package com.hexa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate(true)
@DynamicInsert(true)
@Table(name = "quiz_questions")
public class Questions {

	@Id
	@Column(name = "question_id", nullable = false)

	private int quesId;

	@Column(name = "ques_name", length = 200, nullable = false)
	private String quesName;

	@Column(name = "opt_a", length = 100, nullable = false)
	private String optA;

	@Column(name = "opt_b", length = 100, nullable = false)
	private String optB;

	@Column(name = "opt_c", length = 100, nullable = false)
	private String optC;

	@Column(name = "opt_d", length = 100, nullable = false)
	private String optD;

	@Column(name = "opt_ans", length = 100, nullable = false)
	private String optAns;

	@Column(name = "e_type", length = 100, nullable = false)
	private String eType;

	@ManyToOne
	@JoinColumn(name = "e_id", referencedColumnName = "exam_id")
	private Exam exams;

	public Questions() {

	}

	public Questions(int quesId, String quesName, String optA, String optB, String optC, String optD, String optAns) {
		super();
		this.quesId = quesId;
		this.quesName = quesName;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.optD = optD;
		this.optAns = optAns;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQuesName() {
		return quesName;
	}

	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}

	public String getOptA() {
		return optA;
	}

	public void setOptA(String optA) {
		this.optA = optA;
	}

	public String getOptB() {
		return optB;
	}

	public void setOptB(String optB) {
		this.optB = optB;
	}

	public String getOptC() {
		return optC;
	}

	public void setOptC(String optC) {
		this.optC = optC;
	}

	public String getOptD() {
		return optD;
	}

	public void setOptD(String optD) {
		this.optD = optD;
	}

	public String getOptAns() {
		return optAns;
	}

	public void setOptAns(String optAns) {
		this.optAns = optAns;
	}

	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	public Exam getExams() {
		return exams;
	}

	public void setExams(Exam exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Questions [quesId=" + quesId + ", quesName=" + quesName + ", optA=" + optA + ", optB=" + optB
				+ ", optC=" + optC + ", optD=" + optD + ", optAns=" + optAns + ", eType=" + eType + "]";
	}

}
