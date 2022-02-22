package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("hello.xml");
		Example e1=(Example)context.getBean("one");
		System.out.println(e1);
		Example e2=(Example)context.getBean("one");
		System.out.println(e2);
		Example e3=(Example)context.getBean("one");
        System.out.println(e3);
	}

}
