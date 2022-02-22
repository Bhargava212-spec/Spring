package com.pack;

import org.springframework.beans.factory.annotation.Required;

public class Course {
   private int courseid;
   private String cname;
public int getCourseid() {
	return courseid;
}
@Required
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
   
}
