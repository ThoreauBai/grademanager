package com.grademanager.beans;

public class Student {
	private String ID;
	private String name ;
	private String gradeNum;
	private String classNum;
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", gradeNum="
				+ gradeNum + ", classNum=" + classNum + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	

}
