package com.wipro.Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		
		// Read the Input From KeyBoard
		// new keyword used to create object
		Scanner scan=new Scanner(System.in);
		// Variables  -  Local 
		int numberOne,numberTwo,result;
		System.out.println("Enter Number 1");
		numberOne=scan.nextInt();
		System.out.println("Enter Number 2");
		numberTwo=scan.nextInt();
		Addition ad = new Addition();

		result= ad.add(numberTwo, numberOne);
		
		System.out.println("Addition of Two Number " + result);
		System.out.println("Welcome to Stackroute Program");
		
		
	}
}
