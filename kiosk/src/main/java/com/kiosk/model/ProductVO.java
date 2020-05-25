package com.kiosk.model;

import org.springframework.web.multipart.MultipartFile;

public class ProductVO {

	private String product_name;
	private int product_price;
	private String product_type;
	private String product_image;
	private int product_id;
	
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public String getProduct_image() {
		return product_image;
	}

	public String getProduct_name() {
		return product_name;
	}

	@Override
	public String toString() {
		return "ProductVO [product_name=" + product_name + ", product_price=" + product_price + ", product_type="
				+ product_type + ", product_image=" + product_image + "]";
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}


}
