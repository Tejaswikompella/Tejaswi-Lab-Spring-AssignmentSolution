package com.greatlearning.CollegeEvent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.CollegeEvent.entity.Student;
import com.greatlearning.CollegeEvent.repository.StudRepository;

public class StudService {

	@Autowired
	StudRepository studRepository;

	public List<Student> getAll() {
		return studRepository.getAll();

	}

	public String add(Student stud) {
		// TODO Auto-generated method stub
		return studRepository.add(stud);
	}

	public String edit(Student stud) {
		return studRepository.edit(stud);
	}

	public String studentid(int studentid) {
		return studRepository.delete(studentid);

	}
}
