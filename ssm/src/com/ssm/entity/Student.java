package com.ssm.entity;

public class Student implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int stuId;
	private String stuName;
	private String stuRemark;
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
	public String getStuRemark() {
		return stuRemark;
	}
	public void setStuRemark(String stuRemark) {
		this.stuRemark = stuRemark;
	}
	
	
}
