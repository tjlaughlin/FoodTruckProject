package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckTester {
	static int idNum = 1;
	Scanner kb = new Scanner(System.in);
	FoodTruck[] trucks = new FoodTruck[5];
	boolean keepGoing = true;
	public static void main(String[] args) {
		FoodTruckTester ftt = new FoodTruckTester();
		ftt.run();

	}
	
	
	//do i need to do anything to the variable num on the main page? 
	// ask tina for help then finish the README tonight
	// if so am i adding it to the parameter on this page? maybe a counter for each time the 
	
	private void run() {

		for (int i = 0; i < trucks.length; i++) {
			System.out.println("Enter the name of FoodTruck " + i + ":");
			System.out.println("or enter quit if you are done adding trucks");
			String name = kb.next();
			if (name.equals("quit")) {
				break;
			}
			kb.nextLine();
			System.out.println("Enter the food type of FoodTruck " + i + ":");
			String foodType = kb.next();
			System.out.println("Enter the rating of FoodTruck " + i + ":");
			int rating = kb.nextInt();
			FoodTruck truck = new FoodTruck(name, foodType, rating);
			trucks[i] = truck;
			idNum++;
			
		}
		// need to add quit option when they type it in for the name.
		menu();
		System.out.println("Goodbye friend!");
		// print menu method contained in a loop.
		// use after you run the rest of the methods. add quit option
	}

	public void menu() {
		do {
			System.out.println("Please chose one of the options from the menu");
			System.out.println("*********************************************");
			System.out.println("1. List all food trucks");
			System.out.println("2. See average rating of the food trucks");
			System.out.println("3. Dsiplay the highest rated food truck");
			System.out.println("4. quit the program");
			int choice = kb.nextInt();

			switch (choice) {
			case 1:
				truckNames(trucks);
				break;
			case 2:
				truckRatings(trucks);
				break;
			case 3:
				hiRating(trucks);
				break;
			case 4:
				keepGoing = false;
				break;
			default: 
				System.out.println("invalid option, enter 1-4 to get desired menu option");
			}
		} while (keepGoing);
	} 
	
	

	public void hiRating(FoodTruck[] trucks) {
		double max = 0;
		String highestRatedTruck = "";
		for (int i = 0; i < trucks.length; i++) {

			if (trucks[i] == null) {
				break;
			} else if (max < trucks[i].getRating()) {
				max = trucks[i].getRating();
				highestRatedTruck = trucks[i].toString();
			}
		}
		System.out.println(highestRatedTruck);

	}

	public void truckNames(FoodTruck[] tr) {
		for (int i = 0; i < tr.length; i++) {
			if (tr[i] == null) {
				break;
			}
			System.out.println(tr[i].toString());
		}
	}

	public void truckRatings(FoodTruck[] ratings) {
		double avgRating = 0;
		double ratingsSum = 0;
		int counter = 0;
		for (int i = 0; i < ratings.length; i++) {
			if (ratings[i] == null) {
				continue;

			}
			ratingsSum += (ratings[i].getRating());
			counter++;
		}
		avgRating = ratingsSum / counter;
		System.out.println(avgRating);
	}

}
