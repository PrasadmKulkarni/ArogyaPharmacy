package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ProductCategory;
import com.repository.ProductCategoryRepository;
import com.repository.ProductRepository;

@Service
public class ProductCategoryService {
@Autowired
ProductCategoryRepository productcategoryRepository;
public String tostoreProductcategory(ProductCategory productcategory)
{
	Optional<ProductCategory>op=productcategoryRepository.findById(productcategory.getPcatgid());
	if(op.isPresent())
	{
		return "Already exist";
	}else
	{
		productcategoryRepository.save(productcategory);
		return "Product Category Stored Successfully";
	}
}
}
