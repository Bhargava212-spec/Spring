package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("hello.xml");
		Person p = (Person) c.getBean("person");
		System.out.println(p.getPid() + " " + p.getPname() + " " + p.getAge());
		System.out.println(p.getAddress().getCity());
		System.out.println(p.getAddress().getState());
		System.out.println(p.getAddress().getZipcode());

	}

}
