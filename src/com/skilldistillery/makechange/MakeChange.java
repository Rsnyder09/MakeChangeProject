package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new java.util.Scanner(System.in);

		double price = 0;
		double cash = 0;
		int twenty = 2000;
		int ten = 1000;
		int five = 500;
		int one = 100;
		int quarter = 25;
		int dime = 10;
		int nickle = 5;
		int pennies = 1;

		System.out.println("Hello, what is the price of the item?");
		price = kb.nextDouble();

		System.out.println("How much money was tendered by the customer?");
		cash = kb.nextDouble();

		if (price > cash) {
			System.out.println("Error: The ammount you gave is less than the item you are trying to purchase.");
		} else if (price == cash) {
			System.out.println("Exact ammount was given, have a good day");
		}
		
		int change = Math.round((int) ((cash - price + .00005) * 100));
		//double round = (change + .00005);
		//System.out.println(change);

		String textChange = "";

//System.out.println(intChange);
		int numTwenty = change / twenty;
		change = change % twenty;
		if (numTwenty != 0) {
			textChange += numTwenty + " twenty,";
		}

		int numTen = change / ten;
		change = change % ten;
		// System.out.println("tens");
		if (numTen != 0) {
			// System.out.println("in tens");
			textChange += numTen + " ten,";
			// System.out.println("in tens" + textChange);
			// System.out.println(textChange);
		}

		int numFive = change / five;
		change = change % five;
		if (numFive != 0) {
			textChange += numFive + " five,";
			// System.out.println(textChange);
		}

		int numOne = change / one;
		change = change % one;
		if (numOne != 0) {
			textChange += numOne + " one,";
			// System.out.println(textChange);
		}

		int numQuarters = change / quarter;
		change = change % quarter;
		if (numQuarters != 0) {
			textChange += numQuarters + " Quarter,";
			//System.out.println(textChange);
		}
		//System.out.println(change);

		int numDimes = change / dime;
		change = change % dime;
		if (numDimes != 0) {
			textChange += numDimes + " Dime,";
			//System.out.println(textChange);
		}
		int numNickle = change / nickle;
		change = change % nickle;
		if (numNickle != 0) {
			textChange += numNickle + " nickle,";
			//System.out.println(textChange);
		}
		int numPenny = change / pennies;
		change = change % pennies;
		if (numPenny != 0) {
			textChange += numPenny + " pennies";
			//System.out.println(textChange);
		}

		System.out.println("Amount: " + price + ", Tendered: " + cash + ", Result: " + textChange);

		kb.close();

	}
}
