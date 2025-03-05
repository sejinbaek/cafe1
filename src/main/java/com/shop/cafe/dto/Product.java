//Product 정보를 저장하는 데이터 모델(DTO, Data Transfer Object) 역할

package com.shop.cafe.dto;

public class Product {
	
	private int prodcode, price;
	private String prodname, pimg;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int prodcode, int price, String prodname, String pimg) {
		super();
		this.prodcode = prodcode;
		this.price = price;
		this.prodname = prodname;
		this.pimg = pimg;
	}

	public int getProdcode() {
		return prodcode;
	}

	public void setProdcode(int prodcode) {
		this.prodcode = prodcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	@Override
	public String toString() {
		return "Product [prodcode=" + prodcode + ", price=" + price + ", prodname=" + prodname + ", pimg=" + pimg + "]";
	}
	
	
	

}
