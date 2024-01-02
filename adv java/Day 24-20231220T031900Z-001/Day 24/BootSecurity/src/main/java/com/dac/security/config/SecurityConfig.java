package com.dac.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.dac.security.services.CustomUserDetailsService;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		//create user in InMemoryDataBase
//		UserDetails normalUser=User
//				.withUsername("suresh")
//				.password(passwordEncoder().encode("suresh"))
//				.roles("NORMAL")
//				.build();
//		UserDetails adminUser=User
//				.withUsername("ramesh")
//				.password(passwordEncoder().encode("ram"))
//				.roles("ADMIN")
//				.build();
//		InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager(normalUser,adminUser);
//		return inMemoryUserDetailsManager;
		return new CustomUserDetailsService();
	}
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
		.authorizeHttpRequests()
		
		.requestMatchers("/home/admin","/users/**")
		.hasRole("ADMIN")
		
		.requestMatchers("/home/normal")
		.hasRole("NORMAL")
		
		.requestMatchers("/home/publics")
		.permitAll()
		
		.anyRequest()
		.authenticated()
		
		.and()
		//.httpBasic()
		.formLogin()
		.loginPage("/signin")
		.loginProcessingUrl("/doLogin")
		.defaultSuccessUrl("/home/publics")
		.permitAll();
		
		
		return http.build();
	}
}
