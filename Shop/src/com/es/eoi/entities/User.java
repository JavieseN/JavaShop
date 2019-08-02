package com.es.eoi.entities;

public class User 
{

	private String dni;
	private String username;
	private String pw;
	private String mail;
	private String adress;
	private Order[] orders;
	
	public User() {
		super();
	}
	
	public User(String dni, String username, String pw, String mail, String adress, Order[] orders) {
		super();
		this.dni = dni;
		this.username = username;
		this.pw = pw;
		this.mail = mail;
		this.adress = adress;
		this.orders = orders;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	
}
