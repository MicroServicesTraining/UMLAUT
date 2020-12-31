/**
 * 
 */
package com.mm.sb.sec.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author dorak
 *
 */
@EnableWebSecurity
public class InMemorySecurityConfiguration extends WebSecurityConfigurerAdapter{

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("ravi").password("{noop}1234").roles("CUSTOMER")
			.and().withUser("raju").password("{noop}abcd").roles("SALES_PERSON")
			.and().withUser("rakesh").password("{noop}1234").roles("ADMIN", "SALES_PERSON");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/hello").hasRole("SALES_PERSON")
			.antMatchers("/customer/placeorder").hasRole("CUSTOMER")
			.and().formLogin();
	}

	
	
}
