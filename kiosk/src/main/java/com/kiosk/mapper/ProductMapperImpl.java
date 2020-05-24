package com.kiosk.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiosk.model.LoginVO;
import com.kiosk.model.ProductVO;

@Repository
public class ProductMapperImpl implements ProductMapper{

	@Autowired
	private SqlSession session;
	private static final String namespace ="com.kiosk.mapper.ProductMapper";
	

	@Override
	public List listProduct() throws Exception {
		List list = session.selectList(namespace+".listProduct");
		return list;
	}
	
}
