package com.greatlearning.CollegeEvent.entity;

public class Student {

	private int studentId;
	private String firstName;
	private String lastName;
	private String course;
	private String country;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String firstName, String lastName, String course, String country) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
