package com.kiosk.mapper;

import java.util.List;

import com.kiosk.model.LoginVO;
import com.kiosk.model.ProductVO;

public interface AdminMapper {
	
	public void regProduct(ProductVO pvo) throws Exception;
	
	public LoginVO adminLogin(LoginVO lvo) throws Exception;
	
	public List listProduct() throws Exception;
	
	
}
