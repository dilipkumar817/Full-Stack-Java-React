package com.hcl.assignments;

import java.util.Scanner;

public class StringReversal_Inbuilt {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String reversedString = new StringBuilder(input).reverse().toString();
	        System.out.println("Reversed string using inbuilt method: " + reversedString);
	    }
	}
