package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
  private int sid;
  private String name;
 @Autowired
 @Qualifier(value="course1")
  private Course course;

  
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
public Course getCourse() {
	return course;
}
//@Autowired
public void setCourse(Course course) {
	this.course = course;
	
}
  
  
  
}
