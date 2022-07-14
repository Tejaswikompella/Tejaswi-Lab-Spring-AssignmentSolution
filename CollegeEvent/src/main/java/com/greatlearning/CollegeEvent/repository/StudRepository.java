package com.greatlearning.CollegeEvent.repository;

import java.util.ArrayList;
import java.util.List;

import com.greatlearning.CollegeEvent.entity.Student;

public class StudRepository {

	public List<Student> student = new ArrayList<Student>();

	public List<Student> getAll() {

	return student;
	}

	public String add(Student stud) {
		student.add(stud);
		return "sucessfully added";
	}

	public String edit(Student stud) {

		student.stream().filter(e ->e.getStudentId() == stud.getStudentId()).forEach(e ->{
			e.setFirstName(stud.getFirstName());
			e.setLastName(stud.getLastName());
			e.setCourse(stud.getCourse());
			e.setCountry(stud.getCountry());
		});
		return "updated";
	}
	
	public String delete(int studentid) {
		student.remove(studentid-1);
		return "delete";

	}
}
