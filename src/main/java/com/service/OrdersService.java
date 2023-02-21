package com.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.bean.OrdersItem;
import com.bean.Product;
import com.repository.OrderRepository;

@Service
public class OrdersService {
@Autowired
OrderRepository ordersRepository;

public String storeOrderDetails(Orders orders)
{
	Optional<Orders>op=ordersRepository.findById(orders.getOid());
	
	if(op.isPresent())
	{
		return "order exist";
	}else
	{
		LocalDate returnvalue  = (LocalDate.now()).plusDays(5);
		orders.setOrderDate(LocalDate.now());
		orders.setDeliveryDateTime(returnvalue);
		ordersRepository.save(orders);
		return "Orders Added";
	}
}

public List<Orders> getfindAllOrder()
{
	return ordersRepository.findAll();
}

public String trackDelivery(int oid)
{
	Optional<Orders> op = ordersRepository.findById(oid);
	if(op.isPresent())
	{
		Orders order = op.get();
		//order.getDeleveryDate();	
		int diff= (int) ChronoUnit.DAYS.between( LocalDate.now(),order.getDeliveryDateTime());
		return diff+" days remaining for delivery";
	}
	else
	{
		return "order nt present";
	}
}

public String genrateBill(int oid)
{
	Optional<Orders> op = ordersRepository.findById(oid);
	
	float totalbill=0;
	if(op.isPresent())
	{
		Orders order = op.get();
		//order.getDeleveryDate();	
		List<OrdersItem> or =order.getListOfOrderItem();
		Iterator<OrdersItem> it = or.iterator();
		while(it.hasNext())
		{
			OrdersItem orderItem = it.next();
			
			int custQuantity = orderItem.getQuantity();
			Product product= orderItem.getProduct();
			
			float prodprice= product.getPrice();
			float totalproductprice = custQuantity*prodprice;
			
			totalbill=totalbill+totalproductprice;
			
			
		}
		return "Total bill is " +totalbill;
	}
	else
	{
		return "order not present";
	}
}
}
