package com.hcl.assignments;

import java.util.Scanner;

public class StringReversal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String reversedString = reverseString(input);
		System.out.println("Reversed string without inbuilt method: " + reversedString);
	}

	public static String reverseString(String input) {
		char[] characters = input.toCharArray();
		int left = 0;
		int right = characters.length - 1;

		while (left < right) {
			char temp = characters[left];
			characters[left] = characters[right];
			characters[right] = temp;
			left++;
			right--;
		}

		return new String(characters);
	}
}
