package com.raps;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	
		public void list(){
		ArrayList<Item> cart = new ArrayList<Item>();

		String NameProduct;
		String Description = null;
		int Price;
		int Quantity;

		Scanner scan = new Scanner(System.in);

		String keepShopping = "y";
		Shop cart1 = new Shop();
		do {
			System.out.print("Enter the name of the item: ");
			NameProduct = scan.next();

			System.out.print("Enter the Price: ");
			Price = (int) scan.nextDouble();

			System.out.print("Enter the Quantity: ");
			Quantity = scan.nextInt();

			cart1.addToCart(NameProduct, Description, Price, Quantity);

			System.out.println(cart1);

			System.out.print("Continue shopping (y/n)? ");
			keepShopping = scan.next();
		} while (keepShopping.equals("y"));

		}
	public static void main(String[] args) {
	Shop obj2=new Shop();
	obj2.list();
	

	}

	private void addToCart(String nameProduct, String description, int price, int quantity) {
		

	}
}
