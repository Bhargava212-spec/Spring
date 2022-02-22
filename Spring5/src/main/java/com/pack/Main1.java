package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("example.xml");
		Student st=(Student)c.getBean("stu");
		System.out.println(st.getName()+" "+st.getSid());
		System.out.println(st.getCourse().getCourseid());
		System.out.println(st);
		

	}

}
