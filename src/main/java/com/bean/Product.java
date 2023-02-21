package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Product {
@Id

private int pid;
private String pname;
private float price;
private int pquantity;
private int pcatgid;
//private int cid;
//@OneToMany
//@JoinColumn(name="pid",referencedColumnName = "pid")
//private List<Customer>listOfCustomer;


public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float price, int pquantity, int pcatgid, int cid, List<Customer> listOfCustomer,
		List<Orders> listOfOrders) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.pquantity = pquantity;
	this.pcatgid = pcatgid;
	//this.cid = cid;
	//this.listOfCustomer = listOfCustomer;
	//this.listOfOrders = listOfOrders;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getPquantity() {
	return pquantity;
}
public void setPquantity(int pquantity) {
	this.pquantity = pquantity;
}
public int getPcatgid() {
	return pcatgid;
}
public void setPcatgid(int pcatgid) {
	this.pcatgid = pcatgid;
}
//public int getCid() {
//	return cid;
//}
//public void setCid(int cid) {
//	this.cid = cid;
//}
//public List<Customer> getListOfCustomer() {
//	return listOfCustomer;
//}
//public void setListOfCustomer(List<Customer> listOfCustomer) {
//	this.listOfCustomer = listOfCustomer;
//}
//public List<Orders> getListOfOrders() {
//	return listOfOrders;
//}
//public void setListOfOrders(List<Orders> listOfOrders) {
//	this.listOfOrders = listOfOrders;
//}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pquantity=" + pquantity + ", pcatgid="
			+ pcatgid +   "]";
}


}
