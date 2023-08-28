package com.hcl.assignments;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
	    public static void main(String[] args) {
	        // Create a HashMap to store student names and grades
	        HashMap<String, String> studentGrades = new HashMap<>();

	        // Add students and their grades to the HashMap
	        studentGrades.put("Alice", "A");
	        studentGrades.put("Bob", "B");
	        studentGrades.put("Charlie", "C");
	        studentGrades.put("David", "B+");
	        studentGrades.put("Eve", "A-");

	        // Print student names and their grades
	        System.out.println("Student names and grades:");
	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            String studentName = entry.getKey();
	            String grade = entry.getValue();
	            System.out.println(studentName + ": " + grade);
	        }

	        // Find and remove student with the lowest grade
	        String lowestGradeStudent = findLowestGradeStudent(studentGrades);
	        if (lowestGradeStudent != null) {
	            studentGrades.remove(lowestGradeStudent);
	            System.out.println("Removed lowest grade student: " + lowestGradeStudent);
	        }

	        // Print student names and their grades after removal
	        System.out.println("\nStudent names and grades after removal:");
	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            String studentName = entry.getKey();
	            String grade = entry.getValue();
	            System.out.println(studentName + ": " + grade);
	        }
	    }

	    private static String findLowestGradeStudent(HashMap<String, String> studentGrades) {
	        String lowestGradeStudent = null;
	        String lowestGrade = "Z"; // Assuming grades are in alphabetical order

	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            String grade = entry.getValue();
	            if (grade.compareTo(lowestGrade) < 0) {
	                lowestGrade = grade;
	                lowestGradeStudent = entry.getKey();
	            }
	        }

	        return lowestGradeStudent;
	    }
	}

