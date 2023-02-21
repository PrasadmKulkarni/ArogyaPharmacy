package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.OrdersItem;

public interface OrdersItemRepository extends JpaRepository<OrdersItem, Integer> {

}
