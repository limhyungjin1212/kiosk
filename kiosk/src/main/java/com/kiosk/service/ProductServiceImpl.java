package com.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiosk.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper pm;

	@Override
	public List listProduct() throws Exception {
		return pm.listProduct();
	}
	
	
}
