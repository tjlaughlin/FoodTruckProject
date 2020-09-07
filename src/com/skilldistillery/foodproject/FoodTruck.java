package com.skilldistillery.foodproject;

public class FoodTruck {

	private String name;
	private String foodType;
	private double rating;
	private int idNum = 1;

	//need to do something with the static variable. reference end of review video for static variables
	//
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String FoodType) {
		this.foodType = FoodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(int Rating) {
		this.rating = Rating;
	}

	
	public String toString() {
		String output = "Name: " + name + " " + "FoodType: " + foodType + " " + "Rating: " + rating + " stars";
		return output;
	}

	// put the print method in the main method to prompt the user for info
	// gonna have to use a while loop since they ask for a quit option as well
	// put user input into each food truck method in the foodtruck class page
	// the user is gonna give you all the variables

	// use the to string method to print the date for each food truck
	//

	// probably use a method of this type for each variable for the food truck. will
	// need to put this in the foodtruck call.
	// reference car and car tester for these

	// what is a field? they ask for this in the user stories:
	// fields are the methods used in the food truck class. i.e. food type, food
	// truck name, food truck rating

	// public String toString() {
//	String output = "make=" + make + ", model=" + model + ", color=" + color + ", numberOfWheels=" + numberOfWheels
//			+ ", purchasePrice=" + purchasePrice;
//	return output;
//}

}
