package com.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
@Id
private int oid;
//private int numberofquantity;
private LocalDate orderDate;
private LocalDate deliveryDateTime;

private int cid;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="oid",referencedColumnName = "aid")
private Address address;

@OneToMany
@JoinColumn(name="oid",referencedColumnName = "oid")
private List<OrdersItem>listOfOrderItem;

public Orders() {
	super();
	// TODO Auto-generated constructor stub
}

public Orders(int oid, LocalDate orderDate, LocalDate deliveryDateTime, int cid, Address address,
		List<OrdersItem> listOfOrderItem) {
	super();
	this.oid = oid;
	this.orderDate = orderDate;
	this.deliveryDateTime = deliveryDateTime;
	this.cid = cid;
	this.address = address;
	this.listOfOrderItem = listOfOrderItem;
}

public int getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

public LocalDate getOrderDate() {
	return orderDate;
}

public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}

public LocalDate getDeliveryDateTime() {
	return deliveryDateTime;
}

public void setDeliveryDateTime(LocalDate deliveryDateTime) {
	this.deliveryDateTime = deliveryDateTime;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public List<OrdersItem> getListOfOrderItem() {
	return listOfOrderItem;
}

public void setListOfOrderItem(List<OrdersItem> listOfOrderItem) {
	this.listOfOrderItem = listOfOrderItem;
}

@Override
public String toString() {
	return "Orders [oid=" + oid + ", orderDate=" + orderDate + ", deliveryDateTime=" + deliveryDateTime + ", cid=" + cid
			+ ", address=" + address + ", listOfOrderItem=" + listOfOrderItem + "]";
}




}
