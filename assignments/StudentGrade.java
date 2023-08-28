package com.hcl.assignments;

import java.util.Scanner;

public class StudentGrade {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the student grade (A, B, C, D, or F): ");
	        char grade = scanner.next().toUpperCase().charAt(0);

	        if (grade == 'A') {
	            System.out.println("Excellent Job");
	        } else if (grade == 'B') {
	            System.out.println("Good job");
	        } else if (grade == 'C') {
	            System.out.println("Average Job");
	        } else if (grade == 'D') {
	            System.out.println("Need Improvement");
	        } else if (grade == 'F') {
	            System.out.println("Fail");
	        } else {
	            System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
	        }
	    }
	}

