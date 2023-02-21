package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SupplyOffice {
@Id
private int officeid;
private int productRequestno;
public SupplyOffice() {
	super();
	// TODO Auto-generated constructor stub
}
public SupplyOffice(int officeid, int productRequestno) {
	super();
	this.officeid = officeid;
	this.productRequestno = productRequestno;
}
public int getOfficeid() {
	return officeid;
}
public void setOfficeid(int officeid) {
	this.officeid = officeid;
}
public int getProductRequestno() {
	return productRequestno;
}
public void setProductRequestno(int productRequestno) {
	this.productRequestno = productRequestno;
}
@Override
public String toString() {
	return "SupplyOffice [officeid=" + officeid + ", productRequestno=" + productRequestno + "]";
}




}
