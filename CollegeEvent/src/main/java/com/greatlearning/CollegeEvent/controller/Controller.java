package com.greatlearning.CollegeEvent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.CollegeEvent.entity.Student;
import com.greatlearning.CollegeEvent.service.StudService;

@RestController
@RequestMapping("/stud")
public class Controller {

	@Autowired
	StudService studService;

	@GetMapping("/get/all")
	public List<Student> getAll() {
		return studService.getAll();

	}

	@PostMapping("/add")
	public String add(@RequestBody Student stud) {
		return studService.add(stud);

	}

	@PutMapping("/edit")
	public String edit(@RequestBody Student stud) {
		return studService.edit(stud);

	}

	@DeleteMapping("delete")
	public String delete(@RequestParam int studentid) {
		return studService.studentid(studentid);

	}
}
