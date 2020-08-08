package com.list;

import java.util.ArrayList;

import com.object.Course;
import com.object.Student;

public class CourseList {
	private ArrayList <Course> courseList;
	
	
	public CourseList() {
		courseList = new ArrayList<Course>();
	}
	
	public void addStudent(Course course) {
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
	
	public Course findCourseByCourseId(String courseId) {
		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCourseId().equals(courseId))
				return courseList.get(i);
		}
		return null;
	}
	
	public void sortByCourseId() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareToClassId(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
	public void sortByCourseName() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareToName(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
	public void sortByCourseLevel() {
		for (int i = 0; i < courseList.size(); i++)
			for (int j = 0; j < courseList.size()-1; j++)
				if (courseList.get(j).compareToLevel(courseList.get(i)) > 0)
				{
					Course temp = courseList.get(j);
					courseList.set(j, courseList.get(i));
					courseList.set(i, temp);
				}
	}
	
}
