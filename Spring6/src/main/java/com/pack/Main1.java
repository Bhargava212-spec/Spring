package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		AbstractApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
		Example e=(Example)c.getBean("ex1");
		System.out.println(e.getMessage());
		
		AbstractApplicationContext c1=new ClassPathXmlApplicationContext("hello.xml");
		Course course=(Course)c.getBean("course");
		System.out.println(course.getCname()+""+course.getCid());
		
		c.registerShutdownHook();
	}

}
