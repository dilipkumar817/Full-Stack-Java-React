package com.hcl.assignments;

import java.util.Scanner;

public class EnumMonthExample {
	public enum Month {
		JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
		OCTOBER(31), NOVEMBER(30), DECEMBER(31);

		private final int days;

		Month(int days) {
			this.days = days;
		}

		public int getDays() {
			return days;
		}
	}

	public static void main(String[] args) {
		Month inputMonth = Month.FEBRUARY;
		int daysInMonth = inputMonth.getDays();

		System.out.println("Number of days in " + inputMonth + ": " + daysInMonth);
	}
}
