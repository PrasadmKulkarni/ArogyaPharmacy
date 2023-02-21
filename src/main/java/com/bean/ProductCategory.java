package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ProductCategory {
@Id
private int pcatgid;
private String pcatgname;
@OneToMany
@JoinColumn(name="pcatgid",referencedColumnName = "pcatgid")
private List<Product>listOfProduct;
public ProductCategory() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductCategory(int pcatgid, String pcatgname, List<Product> listOfProduct) {
	super();
	this.pcatgid = pcatgid;
	this.pcatgname = pcatgname;
	this.listOfProduct = listOfProduct;
}
public int getPcatgid() {
	return pcatgid;
}
public void setPcatgid(int pcatgid) {
	this.pcatgid = pcatgid;
}
public String getPcatgname() {
	return pcatgname;
}
public void setPcatgname(String pcatgname) {
	this.pcatgname = pcatgname;
}
public List<Product> getListOfProduct() {
	return listOfProduct;
}
public void setListOfProduct(List<Product> listOfProduct) {
	this.listOfProduct = listOfProduct;
}
@Override
public String toString() {
	return "ProductCategory [pcatgid=" + pcatgid + ", pcatgname=" + pcatgname + ", listOfProduct=" + listOfProduct
			+ "]";
}


}
