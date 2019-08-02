package com.es.eoi.entities;

public class Food extends Article
{
	private String expirationDate;
	private String allergens;
	private static final Double FOOD_VAT = 1.10;

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getAllergens() {
		return allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}

	@Override
	public double getTotalPrice() {
		System.out.println("CALCULADO CON EL IVA DE COMIDA");
		return this.getPrice() * FOOD_VAT;
	}
}
