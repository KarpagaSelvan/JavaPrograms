package com.javaprograms;

public class SwapNumbers {

	public void withUsingThirdVariable() {

		int mySalary = 50000;
		int superiorSalary = 80000;

		// The scenario is swapping the salary of an employee with Superiror's salary by
		// including 3rd person

		int tempSalary = mySalary;
		mySalary = superiorSalary;
		superiorSalary = tempSalary;

		System.out.println("My Salalry after Swapped with Superior's Salary :" + mySalary);
		System.out.println("Superior Salalry after Swapped with my Salary :" + superiorSalary);
	}

	public void withoutUsingThirdVariable() {

		int mySalary = 20000;
		int superiorSalary = 40000;

		// Simple login using basic maths formulae
		superiorSalary = superiorSalary - mySalary;
		mySalary = superiorSalary + mySalary;
		superiorSalary = mySalary - superiorSalary;

		System.out.println("My Salalry after Swapped with Superior's Salary :" + mySalary);
		System.out.println("Superior Salalry after Swapped with my Salary :" + superiorSalary);

	}

	public void byUsingAdditionSubstraction() {

		int mySalary = 25000;
		int superiorSalary = 65000;
		
		//Limitation of this approach is if any of the number is 0 then we will get an Arithmetic exception

		superiorSalary = superiorSalary * mySalary;
		mySalary = superiorSalary / mySalary;
		superiorSalary = superiorSalary / mySalary;

		System.out.println("My Salalry after Swapped with Superior's Salary :" + mySalary);
		System.out.println("Superior Salalry after Swapped with my Salary :" + superiorSalary);

	}

	public static void main(String[] args) {

		SwapNumbers numbers = new SwapNumbers();
		numbers.withoutUsingThirdVariable();
		numbers.withUsingThirdVariable();
		numbers.byUsingAdditionSubstraction();

	}

}
