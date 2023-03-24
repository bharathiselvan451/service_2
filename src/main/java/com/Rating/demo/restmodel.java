package com.Rating.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//import com.sun.istack.NotNull;

@Entity
public class restmodel {

	@Id
	private String email;
	@Column(unique=true)
	private String dmail;
	public String getDmail() {
		return dmail;
	}
	public void setDmail(String dmail) {
		this.dmail = dmail;
	}
	private String name;
	@NotNull
	private String password;
	@Column(nullable = true)
	private int budget;
	@Column(nullable = true)
	private int expense;
	@Column(nullable = true)
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	@Override
	public String toString() {
		return "restmodel [email=" + email + ", dmail=" + dmail + ", name=" + name + ", password=" + password
				+ ", budget=" + budget + ", expense=" + expense + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
