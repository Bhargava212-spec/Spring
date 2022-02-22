package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(ExampleConfig.class);
		Example1 ex1=(Example1)c.getBean(Example1.class);
		System.out.println(ex1+" "+ex1.getMessage1());
		
		Example1 ex3=(Example1)c.getBean(Example1.class);
		System.out.println(ex3+" "+ex3.getMessage1());
		
		
		
		Example2 ex2=(Example2)c.getBean(Example2.class);
		System.out.println(ex2+" "+ex2.getMessage2());
		
		Example2 ex4=(Example2)c.getBean(Example2.class);
		System.out.println(ex4+" "+ex4.getMessage2());


	}

}
