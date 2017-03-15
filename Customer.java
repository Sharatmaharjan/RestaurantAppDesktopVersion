package com.project.restaurant.my;

import java.util.Scanner;

public class Customer {
	private int tableNumber;

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	public static void acceptFood(){
		Scanner scanner=new Scanner(System.in);
		String accept=scanner.nextLine();
		while(!accept.equalsIgnoreCase("a")){
			System.out.println("Please enter A to accept your food.");
			accept=scanner.nextLine();
		}
		if(accept.equalsIgnoreCase("a")){
			Waiter.serveFood();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
