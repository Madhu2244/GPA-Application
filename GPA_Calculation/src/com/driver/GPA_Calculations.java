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
			System.out.println("8: Final Exam Predictor (What do you need on the final exam to move up/down a tier)");
			System.out.println("9: Quit Program");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if (choice == 1)
				Course_Methods.printScale();
			if (choice == 2)
				myCourseList.addCourse(Course_Methods.createCrouse());
			if (choice == 3)
				System.out.println(Course_Methods.toStringCourses(myCourseList));
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
			if (choice == 8)
			{
				System.out.println("Type in the first semester grade");
				int semester1 = Integer.parseInt(scanner.nextLine());
				System.out.println("Type in the second semester grade");
				int semester2 = Integer.parseInt(scanner.nextLine());
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.one(semester1, semester2) + " to first tier (97+)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.two(semester1, semester2) + " to second tier (93-96)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.three(semester1, semester2) + " to third tier (90-92)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.four(semester1, semester2) + " to fourth tier (87-99)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.five(semester1, semester2) + " to fifth tier (83-86)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.six(semester1, semester2) + " to sixth tier (80-82)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.seven(semester1, semester2) + " to seventh tier (77-79)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.eight(semester1, semester2) + " to eighth tier (73-76)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.nine(semester1, semester2) + " to ninth tier (71-72)");
				System.out.println(semester1 + "," + semester2 + " You need a: " + Semester.ten(semester1, semester2) + " to pass (70)");
			}
			if (choice == 9)
				break;
		}
	}
}
