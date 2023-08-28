package com.hcl.assignments;

import java.util.LinkedList;

public class LinkedListReverse {
	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<>();
		nameList.add("Ganga");
		nameList.add("Yamuna");
		nameList.add("Narmada");
		System.out.println("Names in reverse order:");
		for (int i = nameList.size() - 1; i >= 0; i--) {
			System.out.println(nameList.get(i));
		}
	}

}
