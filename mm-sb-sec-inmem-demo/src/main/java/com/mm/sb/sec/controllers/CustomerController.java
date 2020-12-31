/**
 * 
 */
package com.mm.sb.sec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController("customer")
public class CustomerController {
	
	@GetMapping("placeorder")
	public String placeOrder() {
		return "<h1>Welcome Customer, Place your Orders here....!<h1>";
	}

}
