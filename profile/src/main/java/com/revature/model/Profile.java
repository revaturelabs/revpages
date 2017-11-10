package com.revature.model;

import java.sql.Blob;

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
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROFILE_SEQ")
	@SequenceGenerator(name="PROFILE_SEQ", sequenceName="PROFILE_SEQ", allocationSize=1)
	@Column(name="P_ID")
	private int id;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="P_FIRSTNAME")
	private String firstName;
	
	@Column(name="P_LASTNAME")
	private String lastName;
	
	@Column(name="P_LOCATION")
	private String location;
	
	@Column(name="P_TITLE")
	private String title;
	
	@Column(name="P_CERTIFICATIONS")
	private String certifications;
	
	@Column(name="P_SKILLS")
	private String skills;
	
	@Column(name="P_PICTURE")
	private Blob picture;

	public Profile() {
		
	}

	public Profile(int id, int userId, String firstName, String lastName, String location, String title,
			String certifications, String skills, Blob picture) {
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.title = title;
		this.certifications = certifications;
		this.skills = skills;
		this.picture = picture;
	}
}
