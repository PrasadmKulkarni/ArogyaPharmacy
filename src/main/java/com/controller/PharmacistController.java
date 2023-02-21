package com.controller;

import java.util.List;

import javax.websocket.OnMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.bean.Orders;
import com.bean.Product;
import com.bean.ProductRequest;
import com.service.CustomerService;
import com.service.OrdersService;
import com.service.ProductRequestService;
import com.service.ProductService;

@RestController
@RequestMapping("pharmaist")
public class PharmacistController {
	@Autowired
	ProductService productService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	OrdersService orderService;
	
	@Autowired
	ProductRequestService productRequestSerevice;
	
	
	
	
	@GetMapping(value="toCheckPharmacyProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> toCheckPharmacyProduct()
	{
		return productService.tocheckPharmacyProduct();
	}
	
	@GetMapping(value="tofindAllCustomerDetails")
	public List<Customer> tofindAllCustomerDetails()
	{
		return customerService.tofindCustomerDetails();
	}
	
	@GetMapping(value="getAllOrdersDetails")
	public List<Orders>findAllOrderDetails()
	{
		return orderService.getfindAllOrder();
	}
	
	@PostMapping(value = "sendRequest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendRequest(@RequestBody ProductRequest productRequest)
	{
		System.out.println(productRequest.toString());
		return productRequestSerevice.sendRequest(productRequest);
	}
	
	@GetMapping(value = "allProductRequestDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductRequest> allProductRequestDetails(){
		return productRequestSerevice.allProductRequestDetails();
	}
	
	
	@GetMapping(value="generateBill/{orderid}")
	public String generateBill(@PathVariable("orderid") int orderid)
	{
		return orderService.genrateBill(orderid);
	}


	
	
	
	
	


}
