package com.kiosk.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kiosk.service.ProductService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private ProductService ps;
	
	
	@RequestMapping(value ="main" , method = RequestMethod.GET)
	public void mainGet(@RequestParam String whereEat,Model model) throws Exception {
		logger.info("메인으로 왓나요?");
		
		List plist = ps.listProduct();
		
		
		model.addAttribute("plist",plist);
	}
	
	
	@RequestMapping(value ="productDetail" , method = RequestMethod.GET)
	public String productDetail(@RequestParam int no , Model model) throws Exception{
		
		logger.info("상품 디테일로 왔는가?");
		
		model.addAttribute("pd",ps.productDetail(no));
		
		
		return "include/productDetail";
	}
	
	
	
}
