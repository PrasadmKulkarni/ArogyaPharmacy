package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ProductRequest;
import com.repository.ProductRequestRepository;

@Service

public class ProductRequestService {
@Autowired
ProductRequestRepository productRequestRepository;

public String sendRequest(ProductRequest productRequest) {
	System.out.println(productRequest.toString());
	productRequestRepository.save(productRequest);
	return "Request sent Sucessfully..";
}

public List<ProductRequest> allProductRequestDetails(){
	return productRequestRepository.findAll();
}

}
