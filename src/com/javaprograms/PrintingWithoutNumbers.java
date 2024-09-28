package com.javaprograms;

public class PrintingWithoutNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one = 'K' / 'K'; // Dividing the same characters by the same character is = 1
		String s1 = "ssssssssss"; // Length of this String is 10

		// Approach 1 - using String & Characters
		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);
		}

		System.out.println("**********************");
		// Approach 2- using ascii table
		// As per the ascii table --> a=97, b=98, c=99, d=100
		for (int i = one; i <= 'd'; i+=one) {
			System.out.println(i);
		}

	}

}
