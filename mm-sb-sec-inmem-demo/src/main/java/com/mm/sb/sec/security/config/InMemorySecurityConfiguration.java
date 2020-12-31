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
			.and().withUser("raju").password("{bcrypt}$2a$10$i1xFxiQgOb3xmygH.UXnn.8XlQp/7vSHuoxpqdU3ECwj0CWAj/fKu").roles("SALES_PERSON", "CUSTOMER")
			.and().withUser("rakesh").password("{noop}abcd").roles("ADMIN", "SALES_PERSON");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/hello").hasRole("SALES_PERSON")
			.antMatchers("/customer/**").hasRole("CUSTOMER")
			/*.antMatchers("/customer/placeorder").hasRole("CUSTOMER")
			.antMatchers("/customer/revieworder").hasRole("CUSTOMER")*/
			.antMatchers("/").permitAll()
			.and().formLogin();
	}

	
	
}
