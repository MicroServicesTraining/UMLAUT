/**
 * 
 */
package com.mm.sb.sec.demo.basic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
public class DemoController {

	@GetMapping("hello")
	public String sayHello() {
		return "Hello MindMajix...!";
	}
	
}
