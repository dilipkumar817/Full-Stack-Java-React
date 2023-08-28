package com.hcl.assignment2;
import java.util.Arrays;
import java.util.List;

public class SecondSmallest {
	  public static void main(String[] args) {
	    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
	    System.out.println("List of numbers: " + nums);
	    Integer secondSmallest = nums.stream()
	      .distinct()
	      .sorted()
	      .skip(1)
	      .findFirst()
	      .orElse(null);
	    Integer secondLargest = nums.stream()
	      .distinct()
	      .sorted((a, b) -> Integer.compare(b, a))
	      .skip(1)
	      .findFirst()
	      .orElse(null);

	    System.out.println("\nSecond smallest element: " + secondSmallest);
	    System.out.println("\nSecond largest element: " + secondLargest);
	  }

}
