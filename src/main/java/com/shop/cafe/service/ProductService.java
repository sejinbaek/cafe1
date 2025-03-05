//서비스 계층(Service Layer)에서 상품 관련 비즈니스 로직을 처리하는 역할

package com.shop.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.cafe.dao.ProductDao;
import com.shop.cafe.dto.Product;

@Service //비즈니스 로직을 수행하고, DAO와 컨트롤러 간의 연결을 담당
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public List<Product> getAllproducts() throws Exception {
		return productDao.getAllProducts();
	}
	

}
