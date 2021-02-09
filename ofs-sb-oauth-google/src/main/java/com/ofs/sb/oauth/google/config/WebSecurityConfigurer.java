/**
 * 
 */
package com.ofs.sb.oauth.google.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author dorak
 *
 */
@Configuration
@EnableOAuth2Sso
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	   @Override
	   protected void configure(HttpSecurity http) throws Exception {
	    /* http	
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/login")
			.permitAll()
			.and()
			.formLogin()
			.loginPage("/login");*/
		   http
			.antMatcher("/**")
			.authorizeRequests()
			.antMatchers("/oauth/authorize**", "/login**", "/error**")
			.permitAll()
			.and()
			.authorizeRequests()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
			.permitAll();

	   }
	}