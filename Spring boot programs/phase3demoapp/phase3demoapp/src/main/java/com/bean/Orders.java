package com.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int orderid;
@DateTimeFormat(pattern = "YYYY-mm-dd") // mysql default date format. 
private LocalDate orderplaced;
private Integer productid;		//FK 
private String emailid;				//FK
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public LocalDate getOrderplaced() {
	return orderplaced;
}
public void setOrderplaced(LocalDate orderplaced) {
	this.orderplaced = orderplaced;
}
public Integer getProductid() {
	return productid;
}
public void setProductid(Integer productid) {
	this.productid = productid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
