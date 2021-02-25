/**
 * 
 */
package com.mm.profiles.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("pd")
public class ProfilesDemoController {

	@Value("${mm.prof.demo.message}")
	private String message;
	
	@GetMapping
	public String getMessage() {
		return "<h1>"+message+"</h1>";
	}
	
}
