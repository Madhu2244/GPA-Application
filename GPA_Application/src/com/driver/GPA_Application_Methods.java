package com.driver;

import java.util.Scanner;

import com.object.Student;

public class GPA_Application_Methods {
	
	public static Student createStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in the student First Name");
		String firstName = scanner.nextLine();
		System.out.println("Please type in the student Last Name");
		String lastName = scanner.nextLine();
		System.out.println("Please type in the student Grade Level");
		int gradeLevel = Integer.parseInt(scanner.nextLine());
		System.out.println("Please type in the student ID");
		int studentId = Integer.parseInt(scanner.nextLine());
		Student student = new Student(firstName, lastName, studentId, gradeLevel);
		return student;
	}
}
