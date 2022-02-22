package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext c=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		//ApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
	    
		Resource res=new ClassPathResource("hello.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		EmployeeBean emp=(EmployeeBean)factory.getBean("empbean");
		
	}

}
