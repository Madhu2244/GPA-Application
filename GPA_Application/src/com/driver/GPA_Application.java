package com.driver;

import java.util.Scanner;

import com.list.StudentList;

public class GPA_Application {
	
	public static StudentList myStudentList;
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		myStudentList = new StudentList();
		
		while (true) {
			System.out.println("Please type in a number for what you want to do");
			System.out.println("1: Create a Student");
			System.out.println("2: Delete a Student By Id");
			System.out.println("3: Update a Student By Id");
			System.out.println("4: Look at the list of Students by First Name");
			System.out.println("5: Look at the list of Students by Last Name");
			System.out.println("6: Look at the list of Students by Id Number");
			System.out.println("7: Look at the list of Students by Grade Level");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if (choice == 1) {
				myStudentList.addStudent(GPA_Application_Methods.createStudent());
			}
			else 
				break;
		}
	}
}
