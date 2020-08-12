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
	
	public int getLength ()
	{
		return courseList.size();
	}
	
	public Course getCourseFromI(int i) {
		return courseList.get(i);
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
	
	public void sortName() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareName(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
	public void sortType() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareType(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}

	public void sortSemester() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareSemester(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
	public void sortGradeLevel() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareGradeLevel(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
	public void sortPeriod() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).comparePeriod(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	public void sortMultiple() {
		for (int i = 0; i < courseList.size(); i++)
		{
			for (int j = 0; j < courseList.size()-1; j++)
			{
				if (courseList.get(j).compareGradeLevel(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
				if (courseList.get(j).compareSemester(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
				if (courseList.get(j).comparePeriod(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
			}
		}
	}
}

