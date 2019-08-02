package com.es.eoi.entities;

import java.util.Date;

public class Order 
{
	private String code;
	private Date fecha;
	private Article[] articles;
	private boolean payed;
	private User user;
	
	public Order() {
		super();
	}

	public Order(String code, Date fecha, Article[] articles, boolean payed, User user) {
		super();
		this.code = code;
		this.fecha = fecha;
		this.articles = articles;
		this.payed = payed;
		this.user = user;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double calculateTotal()
	{
		double total = 0.0;
		
		for (int i = 0; i < articles.length; i++) 
		{
			total += articles[i].getTotalPrice();
		}
		
		return total;
	}
}
