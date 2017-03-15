package com.project.restaurant.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
	static List<Food> items = new ArrayList<>();

	public static void displayWelcomeMessage() {
		System.out.println("***************Welcome to our Restaurant*************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Please choose your table and enter table number.");
	}

	static {
		setMenu();
	}

	static void setMenu() {
		Food chowmein = new Food();
		chowmein.setFoodDetail("Chowmein", 100);
		items.add(chowmein);
		Food momo = new Food();
		momo.setFoodDetail("Mo:Mo", 120);
		items.add(momo);
		Food pizza = new Food();
		pizza.setFoodDetail("Pizza", 250);
		items.add(pizza);
	}

	public static void customerGuide() {
		Scanner scanner = new Scanner(System.in);
		Customer customer1 = new Customer();
		int tablenumber=scanner.nextInt();
		while(tablenumber>20){
		System.out.println("We only have 20 tables please enter table number again.");
		tablenumber=scanner.nextInt();
		}
		customer1.setTableNumber(tablenumber);
		System.out.println("Please be sitted in table number "+customer1.getTableNumber());
		}

	public static void displayMenu() {
		System.out.println();
		System.out.println("Here is our menu:");
		Iterator<Food> itr=items.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static void displayOptions(){
		System.out.println("*****************************************************");
		System.out.println("Press 1 for Chowmein.");
		System.out.println("Press 2 for Mo:Mo.");
		System.out.println("Press 3 for Pizza.");
	}
	
	static void displayBye(){
		System.out.println("********Thank You for Visiting***********");
	}
}
