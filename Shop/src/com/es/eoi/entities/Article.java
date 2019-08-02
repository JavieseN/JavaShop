package com.es.eoi.entities;

import com.es.eoi.interfaces.Prizable;

public abstract class Article implements Prizable
{
	private int code;
	private String name;
	private Double price=0.0;
	private String vat;
	private Integer stock;
	private String category;
	
	private static final Double DEFAULT_VAT=1.21;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static Double getDefaultVat() {
		return DEFAULT_VAT;
	}
	
	@Override
	public double getTotalPrice()
	{
		System.out.println("CALCULADO CON IVA DEFAULT");
		return this.getPrice() * DEFAULT_VAT;
	}
	
	@Override
	public String toString() 
	{
		return "Article [code="+ code + " ,name=" + name + ", price=" + price + ", stock=" + stock + ", category=" + category + "]";
	}
}
