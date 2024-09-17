package com.promineotech;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("My first Java Program!");
		// this is a comment
		/*
		 * primitive:
		 * int - an integer
		 * double - decimal places 32.802398
		 * float - precision decimal data type 45.8202
		 * long - like an int, numbers can be higher
		 * short - like an int, less of number range
		 * byte - 8 bits of data ex. 01011011
		 * char - a single character - a B A &
		 * boolean - true or false
		 * 
		 * Objects
		 * String - is textual data, a string of characters
		 */

		// variable declaration - type, identifier, assignment operator, value, semicolon
		//operator performs actions on operands
		// + - * /
		int age = 34 * 2;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		System.out.println(age == 68);
		
		age = age+ + 1;
		System.out.println(age);
		
		String firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
	}
}
