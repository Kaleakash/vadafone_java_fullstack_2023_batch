package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Login {
@Id
private String emailid;
private String password;
private String typeofuser;
@OneToMany
@JoinColumn(name="emailid")	// FK 
private List<Orders> listOfOrders;
public String getEmailid() {
	return emailid;
}

@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + ", typeofuser=" + typeofuser + ", listOfOrders="
			+ listOfOrders + "]";
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeofuser() {
	return typeofuser;
}
public void setTypeofuser(String typeofuser) {
	this.typeofuser = typeofuser;
}

}
