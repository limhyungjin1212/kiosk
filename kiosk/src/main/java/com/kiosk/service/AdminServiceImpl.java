package com.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiosk.mapper.AdminMapper;
import com.kiosk.model.LoginVO;
import com.kiosk.model.ProductVO;

@Service
public class AdminServiceImpl implements AdminService{

	
	@Autowired
	private AdminMapper am;

	@Override
	public void regProduct(ProductVO pvo) throws Exception {
		am.regProduct(pvo);
	}
	@Override
	public LoginVO adminLogin(LoginVO lvo) throws Exception {
		return am.adminLogin(lvo);
	}
	@Override
	public List listProduct() throws Exception {
		return am.listProduct();
	}
}
