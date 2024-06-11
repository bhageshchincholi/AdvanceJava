package com.election.beans;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.election.DAO.UserDAO;
import com.election.DAO.UserDaoImpl;
import com.election.entity.User;

public class RegistartionBin {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date date;
	private int status;
	private String role;
	
	private User user;
	
	public RegistartionBin()
	{
		user = new User();
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void authenticate()
	{
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.date = user.getBirth();
		this.status = user.getStatus();
		this.role = user.getRole();
		
		this.user = new User(0,firstName,lastName,email,password,date,status,role);
		try(UserDAO userdao = new UserDaoImpl())
		{
			userdao.save(user);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
