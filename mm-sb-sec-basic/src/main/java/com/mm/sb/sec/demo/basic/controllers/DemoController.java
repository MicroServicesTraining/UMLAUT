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
	
	@GetMapping("/")
	public String getIndexPage() {
		return "Welcome User...!";
	}
		
	@GetMapping("customer/placeorder")
	public String palceOrder() {
		return "<h1>Dear custormer, Place your orders from here...!</h1>";
	}
	
	@GetMapping("customer/revieworder")
	public String reviewOrder() {
		return "<h1>Dear custormer, Review your orders here...!</h1>";
	}
	
	@GetMapping("customer/confirmorder")
	public String confirmOrder() {
		return "<h1>Dear custormer, Confirm your orders here...!</h1>";
	}
}
