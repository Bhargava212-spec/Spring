package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class BeanConfig {
  
	
	@Bean
	public EmployeeBean emBean() {
		return new EmployeeBean();
		
	}
	@Bean
	public EmployeeBean1 emBean1() {
		return new EmployeeBean1();
		
	}
}
