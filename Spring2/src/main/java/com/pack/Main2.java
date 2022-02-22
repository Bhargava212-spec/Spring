package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
	Bean1 bean1=(Bean1)c.getBean("b1");
	System.out.println(bean1.getMessage1()+" "+bean1.getMessage2());
	
	Bean2 bean2=(Bean2)c.getBean("b2");
	System.out.println(bean2.getMessage1()+" "+bean2.getMessage2()+" "+bean2.getMessage3());
	}

}
