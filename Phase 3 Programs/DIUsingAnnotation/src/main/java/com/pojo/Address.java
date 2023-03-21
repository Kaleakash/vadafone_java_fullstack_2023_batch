package com.pojo;

import org.springframework.stereotype.Component;

@Component					//<bean class="com.pojo.Address"></bean>
public class Address {		// by default id is address. 
private String city;
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
