package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		 ApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
		 ExampleCollection e=(ExampleCollection)c.getBean("Collection");
		 System.out.println(e.getAddrList());
		 System.out.println(e.getAddrMap());
		 System.out.println(e.getAddrSet());
		 System.out.println(e.getAddrProp());
		 

	}

}
