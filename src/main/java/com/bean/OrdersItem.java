package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrdersItem {
@Id
private int oiId;
private int oid;
private int quantity;
//@Column(insertable = false,updatable = false)
private int pid;

@OneToOne(cascade = CascadeType.ALL)					 
@JoinColumn(name = "pid",referencedColumnName = "pid",insertable = false,updatable = false)
private Product product;

public OrdersItem() {
	super();
	// TODO Auto-generated constructor stub
}

public OrdersItem(int oiId, int oid, int quantity, int pid, Product product) {
	super();
	this.oiId = oiId;
	this.oid = oid;
	this.quantity = quantity;
	this.pid = pid;
	this.product = product;
}

public int getOiId() {
	return oiId;
}

public void setOiId(int oiId) {
	this.oiId = oiId;
}

public int getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
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
	return "OrdersItem [oiId=" + oiId + ", oid=" + oid + ", quantity=" + quantity + ", pid=" + pid + ", product="
			+ product + "]";
}



}
