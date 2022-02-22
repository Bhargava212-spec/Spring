package com.pack;

public class Student {
int sid;
String sname;
int mark;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}

public Student(int sid, String sname, int mark) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + "]";
}

}
