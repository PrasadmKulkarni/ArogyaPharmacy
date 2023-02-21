package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProductRequestItems {
@Id
private int priID;
private int productRequestno;
private int pid;

@OneToOne(cascade = CascadeType.ALL)					 
@JoinColumn(name = "pid",referencedColumnName = "pid",insertable = false,updatable = false)
private Product product;

public ProductRequestItems() {
	super();
	// TODO Auto-generated constructor stub
}

public ProductRequestItems(int priID, int productRequestno, int pid, Product product) {
	super();
	this.priID = priID;
	this.productRequestno = productRequestno;
	this.pid = pid;
	this.product = product;
}

public int getPriID() {
	return priID;
}

public void setPriID(int priID) {
	this.priID = priID;
}

public int getProductRequestno() {
	return productRequestno;
}

public void setProductRequestno(int productRequestno) {
	this.productRequestno = productRequestno;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

@Override
public String toString() {
	return "ProductRequestItems [priID=" + priID + ", productRequestno=" + productRequestno + ", pid=" + pid
			+ ", product=" + product + "]";
}



}
