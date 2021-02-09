/**
 * 
 */
package com.mm.sb.oauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("students")
public class StudentsController {
	
	@GetMapping
	public ModelAndView getStudents() {
		return new ModelAndView("studentslist");
	}
	
/*	@GetMapping("list")
	public ModelAndView showStudentsList() {
		return new ModelAndView("showstudentslist");
	}
*/
}
