package com.kiosk.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiosk.model.LoginVO;
import com.kiosk.model.ProductVO;

@Repository
public class AdminMapperImpl implements AdminMapper{

	@Autowired
	private SqlSession session;
	private static final String namespace ="com.kiosk.mapper.AdminMapper";
	
	@Override
	public void regProduct(ProductVO pvo) throws Exception {
		
		session.insert(namespace+".regProduct",pvo);
		
	}
	
	@Override
	public LoginVO adminLogin(LoginVO lvo) throws Exception {
		LoginVO loginvo = session.selectOne(namespace+".adminLogin",lvo);
		return loginvo;
	}

	@Override
	public List listProduct() throws Exception {
		List list = session.selectList(namespace+".listProduct");
		return list;
	}
	
}
