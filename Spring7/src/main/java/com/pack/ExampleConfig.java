package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExampleConfig {
  
	@Bean
   public Example1 example1() {
	   return new Example1("Welcome to Spring");
	   
   }
	

	@Bean
	@Primary
   public Example1 example() {
	   return new Example1("Welcome to Hibernate");
	}
	   
	
	
	@Bean
	@Scope("prototype")
   public Example2 example2() {
	   return new Example2("Welcome to Struts");
	   
   }
	
}
