package com.object;
import com.object.Student;


public class StudentInCourse {
	private Course studentClass;
	private Student  student;
	private double grade;
	private double GPA;
	
	public StudentInCourse() {
		studentClass = null;
		student = null;
		grade = 0;
		GPA = 0;
	}
	
	public StudentInCourse(Course studentClass, Student student, int grade, int GPA) {
		this.studentClass = studentClass;
		this.student = student;
		this.grade = grade;
		this.GPA = GPA;
	}

	public Course getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Course studentClass) {
		this.studentClass = studentClass;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	@Override
	public String toString() {
		return  studentClass + "," + student + "," + grade + "," + GPA;
	}
	
	public double compareToGrade(Object o) {
		StudentInCourse other = (StudentInCourse) o;
		return this.grade - (other.grade);
	}
	
	public double compareToGPA(Object o) {
		StudentInCourse other = (StudentInCourse) o;
		return this.GPA - (other.GPA);
	}
	
	
}
