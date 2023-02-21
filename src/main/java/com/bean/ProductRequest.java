package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ProductRequest {
@Id
private int  productRequestno;
private String pharmacyaddress;

@OneToMany
@JoinColumn(name="productRequestno",referencedColumnName = "productRequestno")
private List<SupplyOffice> listOfSupplyOffice;

@OneToMany
@JoinColumn(name="productRequestno",referencedColumnName = "productRequestno")
private List<ProductRequestItems> listOfProductRequestItem;

public ProductRequest() {
	super();
	// TODO Auto-generated constructor stub
}

public ProductRequest(int productRequestno, String pharmacyaddress, List<SupplyOffice> listOfSupplyOffice,
		List<ProductRequestItems> listOfProductRequestItem) {
	super();
	this.productRequestno = productRequestno;
	this.pharmacyaddress = pharmacyaddress;
	this.listOfSupplyOffice = listOfSupplyOffice;
	this.listOfProductRequestItem = listOfProductRequestItem;
}

public int getProductRequestno() {
	return productRequestno;
}

public void setProductRequestno(int productRequestno) {
	this.productRequestno = productRequestno;
}

public String getPharmacyaddress() {
	return pharmacyaddress;
}

public void setPharmacyaddress(String pharmacyaddress) {
	this.pharmacyaddress = pharmacyaddress;
}

public List<SupplyOffice> getListOfSupplyOffice() {
	return listOfSupplyOffice;
}

public void setListOfSupplyOffice(List<SupplyOffice> listOfSupplyOffice) {
	this.listOfSupplyOffice = listOfSupplyOffice;
}

public List<ProductRequestItems> getlistOfProductRequestItem() {
	return listOfProductRequestItem;
}

public void setlistOfProductRequestItem(List<ProductRequestItems> listOfProductRequestItem) {
	this.listOfProductRequestItem = listOfProductRequestItem;
}

@Override
public String toString() {
	return "ProductRequest [productRequestno=" + productRequestno + ", pharmacyaddress=" + pharmacyaddress
			+ ", listOfSupplyOffice=" + listOfSupplyOffice + ", listOfProductRequestItem=" + listOfProductRequestItem + "]";
}



}
