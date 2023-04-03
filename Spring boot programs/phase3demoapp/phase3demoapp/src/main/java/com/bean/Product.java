package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String pname;
private float price;
private int qty;
private Integer categoryid;			//FK
@Lob
private String productimage;
@OneToMany
@JoinColumn(name="productid")		//FK
private List<Orders> listOfOrders;
public int getPid() {
	return pid;
}

@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", categoryid="
			+ categoryid + ", productimage=" + productimage + ", listOfOrders=" + listOfOrders + "]";
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Integer getCategoryid() {
	return categoryid;
}
public void setCategoryid(Integer categoryid) {
	this.categoryid = categoryid;
}
public String getProductimage() {
	return productimage;
}
public void setProductimage(String productimage) {
	this.productimage = productimage;
}
public List<Orders> getListOfOrders() {
	return listOfOrders;
}
public void setListOfOrders(List<Orders> listOfOrders) {
	this.listOfOrders = listOfOrders;
}

}
