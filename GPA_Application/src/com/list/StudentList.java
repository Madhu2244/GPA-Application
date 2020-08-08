package com.list;

import java.util.ArrayList;

import com.object.Student;

public class StudentList 
{
	private ArrayList <Student> studentList;
	
	
	public StudentList() {
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void emptyList() {
		studentList.clear();
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < studentList.size(); i++) {
			if (i != studentList.size()-1)
				output += studentList.get(i).toString() + "\n";
			else
				output += studentList.get(i).toString();
		}
		return output;
	}
	
	public Student findStudentById(int studentId) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getIdNumber() == studentId)
				return studentList.get(i);
		}
		return null;
	}
	
	public void sortByStudentId() {
		for (int i = 0; i < studentList.size(); i++)
			for (int j = 0; j < studentList.size()-1; j++)
				if (studentList.get(j).compareIdNumber(studentList.get(i)) > 0)
				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(i));
					studentList.set(i, temp);
				}
	}
	
	public void sortByFirstName() {
		for (int i = 0; i < studentList.size(); i++)
			for (int j = 0; j < studentList.size()-1; j++)
				if (studentList.get(j).compareToFirstName(studentList.get(i)) > 0)
				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(i));
					studentList.set(i, temp);
				}
	}
	
	public void sortByLastName() {
		for (int i = 0; i < studentList.size(); i++)
			for (int j = 0; j < studentList.size()-1; j++)
				if (studentList.get(j).compareToLastName(studentList.get(i)) > 0)
				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(i));
					studentList.set(i, temp);
				}
	}
	
	public void sortByGradeLevel() {
		for (int i = 0; i < studentList.size(); i++)
			for (int j = 0; j < studentList.size()-1; j++)
				if (studentList.get(j).compareGradeLevel(studentList.get(i)) > 0)
				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(i));
					studentList.set(i, temp);
				}
	}
	
	
}
