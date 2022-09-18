package com.raps;

public class Item {
	private String NameProduct;
	private String Description;
	private int Price;
	private int Quantity;
	
	public Item(String NameProduct, String Description, int Price, int Quantity) {
		super();
		NameProduct = NameProduct;
		Description = Description;
		Price = Price;
		Quantity = Quantity;
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameProduct) {
		NameProduct = nameProduct;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [NameProduct=" + NameProduct + ", Description=" + Description + ", Price=" + Price + ", Quantity="
				+ Quantity + "]";
	}

}
