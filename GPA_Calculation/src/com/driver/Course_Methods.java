package com.driver;

import java.util.ArrayList;
import java.util.Scanner;

import com.object.Course;

public class Course_Methods {
	public static void printScale() {
		System.out.println("Tier \t Grade \t AP \t H \t Reg");
		System.out.println("A+ \t 97+ \t 5.0 \t 4.5 \t 4.0");
		System.out.println("A  \t 93-96 \t 4.8 \t 4.3 \t 3.8");
		System.out.println("A- \t 90-92 \t 4.6 \t 4.1 \t 3.6");
		System.out.println("B+ \t 87-89 \t 4.4 \t 3.9 \t 3.4");
		System.out.println("B \t 83-86 \t 4.2 \t 3.7 \t 3.2");
		System.out.println("B- \t 80-82 \t 4.0 \t 3.5 \t 3.0");
		System.out.println("C+ \t 77-79 \t 3.8 \t 3.3 \t 2.8");
		System.out.println("C \t 73-76 \t 3.6 \t 3.1 \t 2.6");
		System.out.println("C- \t 71-72 \t 3.4 \t 2.9 \t 2.4");
		System.out.println("C- \t 70 \t 3.0 \t 2.5 \t 2.0");
	}
	
	public static Course createCrouse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in the Name of the class");
		String className = scanner.nextLine();
		String classType = "";
		while (true)
		{
			System.out.println("Please type in the Type of class (AP,Honors,Reg)");
			classType = scanner.nextLine();
			if (classType.equals("AP") || classType.equals("Honors") || classType.equals("Reg"))
				break;
		}
		System.out.println("Please type in the Grade");
		int grade = Integer.parseInt(scanner.nextLine());
		int semester = -1;
		while (true)
		{
			System.out.println("Please type in the Semester (1 or 2)");
			semester = Integer.parseInt(scanner.nextLine());
			if (semester == 1 || semester == 2)
				break;
		}
		int gradeLevel = -1;
		while (true)
		{
			System.out.println("Please type in the Grade Level (6-12)");
			gradeLevel = Integer.parseInt(scanner.nextLine());
			if (gradeLevel <= 12 || gradeLevel >= 6)
				break;
		}
		int period = -1;
		while (true)
		{
			System.out.println("Please type in the Class Period (0-7)");
			period = Integer.parseInt(scanner.nextLine());
			if (period <= 7 || gradeLevel >= 0)
				break;
		}
		
		Course course = new Course(className,classType,grade,semester,gradeLevel,period);
		return course;
	}
	
	
}
