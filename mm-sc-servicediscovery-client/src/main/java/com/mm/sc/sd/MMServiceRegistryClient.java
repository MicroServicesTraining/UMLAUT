/**
 * 
 */
package com.mm.sc.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dorak
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class MMServiceRegistryClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MMServiceRegistryClient.class, args);
	}

}
