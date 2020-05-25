package com.kiosk.mapper;

import java.util.List;

import com.kiosk.model.ProductVO;

public interface ProductMapper {
	
	public List listProduct() throws Exception;
	
	public ProductVO productDetail(int pno) throws Exception;
}
