package com.object;

public class Student {
	private String firstName;
	private String lastName;
	private int idNumber;
	private int gradeLevel;
	
	public Student()	{
		firstName = "Invalid";
		lastName = "Invalid";
		idNumber = 0;
		gradeLevel = 0;
	}
	
	public Student(String firstName, String lastName, int idNumber, int gradeLevel)	{
		firstName = this.firstName;
		lastName = this.lastName;
		idNumber = this.idNumber;
		gradeLevel = this.gradeLevel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return firstName + "," + lastName + "," + idNumber + "," + gradeLevel;
	}

	public int compareToFirstName(Object o) {
		Student other = (Student) o;
		return this.firstName.compareTo(other.firstName);
	}
	
	public int compareToLastName(Object o) {
		Student other = (Student) o;
		return this.lastName.compareTo(other.lastName);
	}
	
	public int compareIdNumber(Object o) {
		Student other = (Student) o;
		return this.idNumber - other.idNumber;
	}
	
	public int compareGradeLevel(Object o) {
		Student other = (Student) o;
		return this.gradeLevel - other.gradeLevel;
	}
	
	
}
