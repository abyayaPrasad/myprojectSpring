package com.demo.app.model.copy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity					// Here the Entity will create a database for you through JPA and the table name will be the class name "Alien"
public class Alien 		//This class is a model class 
{
	@Id					// Here Id will create the columns inside the table this is done through JPA
	private int aid;		// These are the few properties that this Model has and ID and NAME
	private String aname;
	private String tech;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	
	
	
}
