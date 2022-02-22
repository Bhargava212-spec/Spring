package com.pack;

public class Person {
int pid;
String pname;
int age;
Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
