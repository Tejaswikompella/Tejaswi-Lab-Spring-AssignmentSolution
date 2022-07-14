package com.greatlearning.CollegeEvent;

import java.util.Arrays;

//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.CollegeEvent.entity.Student;
import com.greatlearning.CollegeEvent.repository.StudRepository;

@SpringBootApplication
public class CollegeEventApplication {

	@Autowired
	StudRepository studRepository;

	public static void main(String[] args) {
		SpringApplication.run(CollegeEventApplication.class, args);
	}
		
//		StudRepository sr = new StudRepository();
//        
//        Student stud1 = new Student(1, "suresh", "reddy", "btech", "india");
//        
//        Student stud2 = new Student(2, "muri", "mohan", "btech", "USA");
//        
//        Student stud3 = new Student(3, "daniel", "denson", "btech", "new zealand");
//        
//        Student stud4 = new Student(4, "tanya", "gupta", "bcom", "canada");
//        
//        
//        System.out.println(sr.add(stud1));
//        
//        System.out.println(sr.edit(stud2));
//        
//        System.out.println(sr.add(stud3));
//        
//        System.out.println(sr.edit(stud4));
//
//        
//        System.out.println(sr.getAll().get(0).getCourse());
//	}

	public void run(String... args) throws Exception {
		Student e1 = new Student(1, "suresh", "reddy", "btech", "india");
		Student e2 = new Student(2, "muri", "mohan", "btech", "canada");
		Student e3 = new Student(3, "daniel", "denson", "btech", "new zealand");
		Student e4 = new Student(4, "tanya", "gupta", "bcom", "usa");
		studRepository.student.addAll(Arrays.asList(e1, e2, e3, e4));
	}
}
