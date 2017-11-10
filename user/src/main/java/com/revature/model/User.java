package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Peter
 */
@Entity
@Table(name="USER_T")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	@SequenceGenerator(name="USER_SEQ", sequenceName="USER_SEQ", allocationSize=1)
	@Column(name="U_ID")
	private int id;
	
	@Column(name="U_EMAIL")
	private String email;
	
	@Column(name="U_PASSWORD")
	private String password;
	
	@Column(name="U_ROLE")
	private String role;

	public User() {
		this.email = "";
		this.password = "";
		this.role = "";
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public User(int id, String email, String password, String role) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
}
