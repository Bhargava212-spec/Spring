package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//employee.html is present src/main/resources
		
		//hello.xml is present inside src/main/resources
				Resource res = new ClassPathResource("hello.xml");
				BeanFactory factory = new XmlBeanFactory(res);
				//factory.getBean("emp");
				Employee e=(Employee)factory.getBean("emp1");
				//instantiate the bean with id emp and performs DI
			    //System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());
				System.out.println(e);

	}

}