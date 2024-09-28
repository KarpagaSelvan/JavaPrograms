package com.javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "Selvah";
		char[] charArray = given.toCharArray();
		String reversed = "";

		StringBuffer buffer = new StringBuffer();
		StringBuffer reverse = buffer.append(given).reverse();
		System.out.println(reverse);

		StringBuilder builder = new StringBuilder();
		builder.append(given);
		System.out.println(builder.reverse());

		for (int i = given.length() - 1; i >= 0; i--) {

			reversed = reversed + charArray[i];

		}

		System.out.println(reversed);

	}

}
