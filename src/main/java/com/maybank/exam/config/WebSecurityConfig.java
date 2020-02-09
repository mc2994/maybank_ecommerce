package com.maybank.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	private BasicAuthenticationPoint basicAuthenticationPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers(HttpMethod.POST, "/", "/products/**").authenticated()
				.antMatchers(HttpMethod.DELETE, "/", "/products/**").authenticated()
				.antMatchers(HttpMethod.PUT, "/", "/products/**").authenticated();

		http.authorizeRequests().antMatchers(HttpMethod.GET, "/", "/products/**").permitAll();
		http.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("mckinley").password(passwordEncoder.encode("mckinley")).roles("USER");
	}
}