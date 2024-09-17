//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		
		// 2. Create a variable to hold the cost of groceries at checkout
		
		
		// 3. Create a variable to hold a person's middle initial
		
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		// 5. Create a variable to hold a customer's first name
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1234 Easy Street";
		

		// 7. Print all variables to the console
		
		System.out.println(streetAddress);
		

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		int totalPlaneSeats = 401;
		int totalSeatsTaken = 2;
		int availablePlaneSeats = totalPlaneSeats - totalSeatsTaken;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		double costOfGroceries = 45.32;
		double totalCostOfGroceries = costOfGroceries + 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		char middleInitial = 'J';
	

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		boolean isHotOutside = false;
		
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerFirstName = "Sam";
		char newMiddleInitial = 'I';
		String customerLastName = "Turkey";
		String fullName = customerFirstName + " " + newMiddleInitial + " " + customerLastName;
		System.out.println(fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println("Hello my name is " + fullName);
		System.out.println("I live at " + streetAddress);
		
	}
}