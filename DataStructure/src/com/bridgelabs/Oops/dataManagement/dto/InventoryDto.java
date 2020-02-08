package com.bridgelabs.Oops.dataManagement.dto;

/**
 * purpose : To transfer the data from server to the jsonFile
 * 
 * @author Nikunj Balar
 *
 */
public class InventoryDto {

	private String name;
	private int quantity;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "InventoryDto [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
}
