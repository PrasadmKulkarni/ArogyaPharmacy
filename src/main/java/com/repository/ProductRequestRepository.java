package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.ProductRequest;
@Repository
public interface ProductRequestRepository extends JpaRepository<ProductRequest, Integer>{

}
