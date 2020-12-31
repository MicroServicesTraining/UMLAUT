/**
 * 
 */
package com.mm.sb.sec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
	
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
