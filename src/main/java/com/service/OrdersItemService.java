package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.OrdersItem;
import com.repository.OrdersItemRepository;

@Service
public class OrdersItemService {
@Autowired
OrdersItemRepository ordersItemRepository;
public String toaddordersItem(OrdersItem ordersItem)
{
	Optional<OrdersItem>op=ordersItemRepository.findById(ordersItem.getOiId());
	if(op.isPresent())
	{
		return "Already Order Item Present";
	}else
	{
		ordersItemRepository.save(ordersItem);
		return "Order Item Stored Successfully";
	}
}
}
