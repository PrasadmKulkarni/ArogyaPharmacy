package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
ProductRepository productRepository;
public String storeProductDetails(Product product)
{
	Optional<Product>op=productRepository.findById(product.getPid());
	if(op.isPresent())
	{
		return "Already Exist";
	}
	else
	{
		productRepository.save(product);
		return "Product Stored Successfully"; 
		
		
	}
}

public List<Product> tocheckPharmacyProduct()
{
	return productRepository.findAll();
}


}
