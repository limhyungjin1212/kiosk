package com.kiosk.service;

import java.util.List;

import com.kiosk.model.ProductVO;

public interface ProductService {
	
	public List listProduct() throws Exception;
	
	public ProductVO productDetail(int pno) throws Exception;
}
