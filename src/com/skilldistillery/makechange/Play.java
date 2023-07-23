package com.skilldistillery.makechange;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		Scanner kb = new java.util.Scanner(System.in);

		
		
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickle = 0;
		int pennies = 0;
		
		double price = 0;
		double cash = 0;
		double change = 0;
		
		System.out.println("Hello, what is the price of the item?");
		price = kb.nextDouble();

		System.out.println("How much money was tendered by the customer?");
		cash = kb.nextDouble();

		if (price > cash) {
			System.out.println("Error: The ammount you gave is less than the item you are trying to purchase.");
		} else if (price == cash) {
			System.out.println("Exact ammount was given, have a good day");
		}
		
		//calculate change
		change = cash - price;
		
		int dollars =(int) change;
		
		double cents = change-dollars * 100;
		
		//double round = (change + .00005);
		
		//compute 20;
		
		double twentyD = dollars / 20;
		twenty = (int)twentyD;
		
		
		
		//compute 10
		double tenD = (int)(dollars-(twenty * 20))/10;
		ten = (int) tenD;
		
	//compute 5
		five =(int) ((tenD-ten)*10)/5;
		
			System.out.println(twentyD);	

		

		
		
		//double tenDollarBill = (dollars -())
		
		

		kb.close();

	}

	}


