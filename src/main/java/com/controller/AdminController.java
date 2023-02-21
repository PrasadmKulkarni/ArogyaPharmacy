package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.bean.Orders;
import com.bean.OrdersItem;
import com.bean.Product;
import com.bean.ProductCategory;
import com.service.CustomerService;
import com.service.OrdersItemService;
import com.service.OrdersService;
import com.service.ProductCategoryService;
import com.service.ProductService;

@RestController
@RequestMapping("admins")
public class AdminController {
	
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrdersService orderService;
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	OrdersItemService ordersItemService;
	
	
	@PostMapping(value="storeProductDetails",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductDetails(@RequestBody Product product)
	{
		return productService.storeProductDetails(product);
	}
	
	@PostMapping(value="storeorderDetails",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeorderDetails(@RequestBody Orders orders)
	{
		return orderService.storeOrderDetails(orders);
	}
	
	@PostMapping(value="storeProductCategoryDetails",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductCategoryDetails(@RequestBody ProductCategory productCategory)
	{
		return productCategoryService.tostoreProductcategory(productCategory);
	}
	
	@PostMapping(value="storeordersItem",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeordersItem(@RequestBody OrdersItem ordersItem)
	{
		return ordersItemService.toaddordersItem(ordersItem);
	}
	
	@GetMapping(value="getAllOrdersDetails")
	public List<Orders>findAllOrderDetails()
	{
		return orderService.getfindAllOrder();
	}

}
