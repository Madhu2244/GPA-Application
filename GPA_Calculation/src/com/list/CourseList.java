package com.list;

import java.util.ArrayList;

import com.object.Course;

public class CourseList {
	private ArrayList <Course> courseList;
	
	
	public CourseList() {
		courseList = new ArrayList<Course>();
	}
	
	public void addCourse(Course course) {
		courseList.add(course);
	}
	
	public void emptyList() {
		courseList.clear();
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < courseList.size(); i++) {
			if (i != courseList.size()-1)
				output += courseList.get(i).toString() + "\n";
			else
				output += courseList.get(i).toString();
		}
		return output;
	}	
	
	public double calculateTotalGPA() {
		double output = 0.0;
		for (int i = 0; i < courseList.size(); i++)
		{
			output += courseList.get(i).calculateCourseGPA();
		}
		return output / courseList.size();
	}
	
	public double calculateSemesterGPA(int Semester, int gradeLevel) {
		double output = 0.0;
		int count = 0;
		for (int i = 0; i < courseList.size(); i++)
		{
			if (courseList.get(i).getSemester() == Semester && courseList.get(i).getGradeLevel() == gradeLevel)
			{
				output += courseList.get(i).calculateCourseGPA();
				count ++;
			}
		}
		return output / courseList.size();
	}
	
}
