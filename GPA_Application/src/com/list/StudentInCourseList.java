package com.list;

import java.util.ArrayList;

import com.object.StudentInCourse;

public class StudentInCourseList {
	private ArrayList <StudentInCourse> studentInCourseList;
	
	
	public StudentInCourseList() {
		studentInCourseList = new ArrayList<StudentInCourse>();
	}
	
	public void addStudentCourse(StudentInCourse studentInCourse) {
		studentInCourseList.add(studentInCourse);
	}
	
	public void emptyList() {
		studentInCourseList.clear();
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < studentInCourseList.size(); i++) {
			if (i != studentInCourseList.size()-1)
				output += studentInCourseList.get(i).toString() + "\n";
			else
				output += studentInCourseList.get(i).toString();
		}
		return output;
	}
	
	public void sortByGrade() {
		for (int i = 0; i < studentInCourseList.size(); i++)
			for (int j = 0; j < studentInCourseList.size()-1; j++)
				if (studentInCourseList.get(j).compareToGrade(studentInCourseList.get(i)) > 0)
				{
					StudentInCourse temp = studentInCourseList.get(j);
					studentInCourseList.set(j, studentInCourseList.get(i));
					studentInCourseList.set(i, temp);
				}
	}
	
	public void sortByGPA() {
		for (int i = 0; i < studentInCourseList.size(); i++)
			for (int j = 0; j < studentInCourseList.size()-1; j++)
				if (studentInCourseList.get(j).compareToGPA(studentInCourseList.get(i)) > 0)
				{
					StudentInCourse temp = studentInCourseList.get(j);
					studentInCourseList.set(j, studentInCourseList.get(i));
					studentInCourseList.set(i, temp);
				}
	}
	
}
