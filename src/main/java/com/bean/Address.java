package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int aid;
private String areaName;
private String city;
private String state;
private long pincode;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int aid, String areaName, String city, String state, long pincode) {
	super();
	this.aid = aid;
	this.areaName = areaName;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
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
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", areaName=" + areaName + ", city=" + city + ", state=" + state + ", pincode="
			+ pincode + "]";
}

}
