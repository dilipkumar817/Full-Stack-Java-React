package com.hcl.assignments;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(5);
		integerList.add(6);
		int sum = 0;
		for (int num : integerList) {
			sum = sum+ num;
		}
		System.out.println("Sum of the integers: " + sum);
	}
}
