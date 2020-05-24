package com.kiosk.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kiosk.model.LoginVO;
import com.kiosk.model.ProductVO;
import com.kiosk.service.AdminService;
import com.kiosk.util.UploadFileUtils;

@RequestMapping(value = "/admin")
@Controller
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	
	@Autowired
	private AdminService as;
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void adminLoginGET(String error, String logout, Model model) {
		logger.info("error " + error);
		logger.info("logout " + logout);

		if (error != null) {
			model.addAttribute("error", "�α��� ���� ���̵��й�ȣ�� Ȯ���ϼ���");
		}
		if (logout != null) {
			model.addAttribute("logout", "�α׾ƿ�");
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String adminLoginPost(LoginVO lvo) throws Exception {
		logger.info("로그인 포스트" + lvo);
		System.out.println(lvo);

		as.adminLogin(lvo);

		return "redirect:/admin/adminMain";
	}
	
	@RequestMapping(value="/adminMain" , method = RequestMethod.GET)
	public void adminMain(Model model) throws Exception{
		
		List plist = as.listProduct();
		
		
		model.addAttribute("plist",plist);
		
	}
	
	
	@RequestMapping(value="productRegister", method=RequestMethod.POST)
	public String productRegister(ProductVO pvo,@RequestParam("file") MultipartFile file) throws Exception {
		
		logger.info("originalName : " + file.getOriginalFilename());
		logger.info("size : " + file.getSize());
		logger.info("contentType : " + file.getContentType());
		logger.info("byte :" + file.getBytes());
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		
		String path = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());
		pvo.setProduct_image(path);
		logger.info("pvo="+pvo);
		
		as.regProduct(pvo);
		
		return "admin/adminMain";
	}
	
	private String uploadFile(String originalName, byte[] fileData) throws

	Exception {
		UUID uid = UUID.randomUUID(); // UUID(Universally Unique Identifier) : 범용 고유 식별자
		String savedName = uid.toString() + "_" + originalName;
		// 파일이름이 똑같으면 uuid랜덤으로 구별.
		File target = new File(uploadPath, savedName);

		FileCopyUtils.copy(fileData, target); // 파일을 복사. 업로드 경로 + 이름

		return savedName;

	}
	@RequestMapping(value = "/customLogin", method = RequestMethod.GET)
	public void customLogin(String error, String logout, Model model) {
		logger.info("error " + error);
		logger.info("logout " + logout);

		if (error != null) {
			model.addAttribute("error", "�α��� ���� ���̵��й�ȣ�� Ȯ���ϼ���");
		}
		if (logout != null) {
			model.addAttribute("logout", "�α׾ƿ�");
		}

	}
}
