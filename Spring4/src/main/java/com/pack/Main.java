package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Sample.xml");
		Employee e=(Employee)c.getBean("emp");
		System.out.println(e.getEmpid()+" "+e.getName());
		System.out.println(e.getManager().getMgr_name());
		System.out.println(e.getManager().getDept());

	}

}
