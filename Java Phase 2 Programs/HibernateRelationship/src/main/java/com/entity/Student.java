package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {			// map to student table 
@Id
private int sid;
private String sname;
private int age;
private Integer tsid;				//FK because Integer can hold null value 
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Integer getTsid() {
	return tsid;
}
public void setTsid(Integer tsid) {
	this.tsid = tsid;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", tsid=" + tsid + "]";
}

}
