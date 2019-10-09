package com.hexa.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate(true)
@DynamicInsert(true)
@Table(name = "quiz_user")
public class User {

	@Id
	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "user_name", length = 25, nullable = false)
	private String userName;

	@Column(name = "user_pass", length = 20, nullable = false)
	private String userPass;

	@OneToMany(mappedBy = "user")
	private Set<Schedule> sch;

	public User() {

	}

	public User(int userId, String userName, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Set<Schedule> getSch() {
		return sch;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + "]";
	}

	public void setSch(Set<Schedule> sch) {
		this.sch = sch;
	}

}
