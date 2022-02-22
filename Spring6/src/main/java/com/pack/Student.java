package com.pack;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student  implements InitializingBean,DisposableBean {
   private int sid;
   private String name;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void destroy() throws Exception {
	System.out.println("Student bean Destroyed");
}
public void afterPropertiesSet() throws Exception {

    System.out.println("Student bean is initialized using InitializingBean");
   }
   
   
}
