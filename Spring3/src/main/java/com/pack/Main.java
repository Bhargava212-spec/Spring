package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
		Employee e=(Employee)c.getBean("emp");
		//System.out.println(e.getEid()+" "+e.getEname());
		//System.out.println(e.getAddress().getCity());
		//System.out.println(e.getAddress().getCity());
		System.out.println(e);
	}

}
