/**
 * 
 */
package com.mm.sb.oauth2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.oauth2.entities.Student;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("students")
public class StudentController {

	private List<Student> students;
	
	@GetMapping
	public List<Student> getStudents(){
		createStudents();
		return students;
	}
	
	@RequestMapping("profile")
    public ResponseEntity<Student> getProfile() 
    {
     
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
        Student student = new Student();
        student.setName(user.getUsername());
        student.setRollNo(1001);
        student.setCourse("Microservices");
 
        return ResponseEntity.ok(student);
    }

	private void createStudents() {
		students = new ArrayList<>();
		Student st1 = new Student(1001, "Raju", "Java");
		Student st2 = new Student(1002, "Rakesh", "Oracle");
		students.add(st1);
		students.add(st2);
	}
	
}
