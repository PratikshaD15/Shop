package com.raps;

public class Cart {
	private Item[] itemList;
	private double totalPrice;
	private static final int capacity = 5;
	// private static final int increaseSize=3;

	public Cart() {
		itemList = new Item[capacity];
		int numItem = 0;

	}

	public int getTotalPrice() {
		double totalPrice = 0.0;

		for (int i = 0; i < itemList.length; i++) {
			if (itemList[i].getNameProduct().equals(itemList))
				;
			return i;
		}
		return -1;
	}

	public boolean addToCard(String nameProduct, String description, int price, int quantity) {
		Item n = new Item(nameProduct, description, price, quantity);

//		for (int i = 0; i < numItem; i++) {
//
//			if (itemList[i].getNameProduct().equals(nameProduct)) {
//				itemList[i].getQuantity() += getquantity;
//				return true;
//			}
//		}
//		if (numItem == capacity)
//		{

//	}
//itemList[numItems]=n;
//numItems+=1;
//return true;
		int numItem = 0;
		if (numItem == capacity)
			return false;

		itemList[numItem] = n;
		if (itemList[numItem].getNameProduct().equals(nameProduct)) {
			quantity = quantity + 1;
			return true;
		} else if (!itemList[numItem].getNameProduct().equals(nameProduct)) {
			numItem = numItem + 1;
			return true;
		}

		return false;
	}

	public String display() {

		int numItem = 0;
		for (int i = 0; i < numItem; i++) {
			System.out.println(itemList[i].toString());

		}
		return toString();

	}
public static void main(String[] args) {
	Cart obj=new Cart();
	obj.display();
obj.getTotalPrice();
obj.addToCard("watch", "fp", 01, 10);

	System.out.println("done");
}
}
