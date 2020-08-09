package com.driver;

import java.util.Scanner;

import com.list.CourseList;

public class GPA_Calculations {
	public static CourseList myCourseList;
	
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		myCourseList = new CourseList();
		while (true) {
			System.out.println("Please type in a number for what you want to do");
			System.out.println("1: See the GPA Scale");
			System.out.println("2: Create a Course");
			System.out.println("3: Show Course List");
			System.out.println("4: Calculate Total High School GPA");
			System.out.println("5: Calculate Semester GPA");
			System.out.println("6: Save to File");
			System.out.println("7: Read from File");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if (choice == 1)
				Course_Methods.printScale();
			if (choice == 2)
				myCourseList.addCourse(Course_Methods.createCrouse());
			if (choice == 3)
				System.out.println(myCourseList.toString());
			if (choice == 4)
				System.out.println(myCourseList.calculateTotalGPA());
			if (choice == 5)
			{
				System.out.println("Type in the semester");
				int semester = Integer.parseInt(scanner.nextLine());
				System.out.println("Type in the Grade Level");
				int gradeLevel = Integer.parseInt(scanner.nextLine());
				System.out.println(myCourseList.calculateSemesterGPA(semester,gradeLevel));
			}
			if (choice == 6)
			{
				Course_Methods.createFile();
				Course_Methods.writeToFile(myCourseList);
			}
			if (choice == 7)
			{
				myCourseList.emptyList();
				myCourseList = Course_Methods.readFromFile();
			}
		}
	}
}
