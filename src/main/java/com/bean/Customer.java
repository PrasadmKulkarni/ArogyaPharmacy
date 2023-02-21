package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
private int cid;
private String cname;
private String cgender;
private long contactno;
//private int pid;
//@OneToMany
//@JoinColumn(name="cid",referencedColumnName = "cid")
//private List<Product>listOfProduct;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="cid",referencedColumnName = "fid")
private FeedBack feedback;

@OneToMany
@JoinColumn(name="cid",referencedColumnName = "cid")
private List<Orders>listofOrder;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String cname, String cgender, long contactno, int pid, List<Product> listOfProduct,
		List<Orders> listofOrder, Address address) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cgender = cgender;
	this.contactno = contactno;
	//this.pid = pid;
//	this.listOfProduct = listOfProduct;
	this.listofOrder = listofOrder;
	//this.address = address;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCgender() {
	return cgender;
}
public void setCgender(String cgender) {
	this.cgender = cgender;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
//public int getPid() {
//	return pid;
//}
//public void setPid(int pid) {
//	this.pid = pid;
//}
//public List<Product> getListOfProduct() {
//	return listOfProduct;
//}
//public void setListOfProduct(List<Product> listOfProduct) {
//	this.listOfProduct = listOfProduct;
//}
public List<Orders> getListofOrder() {
	return listofOrder;
}
public void setListofOrder(List<Orders> listofOrder) {
	this.listofOrder = listofOrder;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cgender=" + cgender + ", contactno=" + contactno
			+ ", listofOrder=" + listofOrder + "]";
}




}
