package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculations App");

		
		int i=Console.getInt("Enter a number: ");
	    System.out.println("Square "+BasicCalculations.getSquare(i));
		
		
		String line=Console.getLine("Enter a sentence: ");
		System.out.println("#'s of a's "+BasicCalculations.getCountA(line));
		
		
		System.out.println("Peace");
	}

}
