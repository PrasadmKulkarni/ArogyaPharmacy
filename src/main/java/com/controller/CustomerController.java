package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.bean.FeedBack;
import com.bean.Orders;
import com.service.CustomerService;
import com.service.FeedBackService;
import com.service.OrdersService;

@RestController
@CrossOrigin
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	OrdersService orderService;
	
	@Autowired
	FeedBackService feedBackService;
	
	@PostMapping(value="storeCustomerDetails",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerDetails(@RequestBody Customer customer)
	{
		return customerService.storeCustomerDetails(customer);
	}
	
	@GetMapping(value="trackDelivery",produces = MediaType.APPLICATION_JSON_VALUE)
	public String trackDelivery(@RequestBody Orders orders)
	{
		return orderService.trackDelivery(1);
	}
	
	@PostMapping(value="GetFeedback" , produces = MediaType.APPLICATION_JSON_VALUE)
		public String GetFeedback(@RequestBody FeedBack feedback)
		{
			System.out.println(feedback.toString());
			return feedBackService.GiveFeedback(feedback);
		}
	
}
