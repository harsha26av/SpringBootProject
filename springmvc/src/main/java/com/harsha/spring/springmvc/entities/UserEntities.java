package com.harsha.spring.springmvc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="userdata")
public class UserEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date ddate;
	private String ddescription;
	private int userid;
	
	public UserEntities() {
		
	}

	public UserEntities(int id, Date ddate, String ddescription, int userid) {
		super();
		this.id = id;
		this.ddate = ddate;
		this.ddescription = ddescription;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDdate() {
		return ddate;
	}

	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}

	public String getDdescription() {
		return ddescription;
	}

	public void setDdescription(String ddescription) {
		this.ddescription = ddescription;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	
}
