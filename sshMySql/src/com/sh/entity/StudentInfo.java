package com.sh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StudentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int  stuId;
	private String stuName;
	private int stuAge;
	private int stuGender;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuGender() {
		return stuGender;
	}
	public void setStuGender(int stuGender) {
		this.stuGender = stuGender;
	}
	public StudentInfo(int stuId, String stuName, int stuAge, int stuGender) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuGender = stuGender;
	}
	public StudentInfo() {
		super();
	}
	
	
}
