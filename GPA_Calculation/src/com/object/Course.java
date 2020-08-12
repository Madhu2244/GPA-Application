package com.object;

public class Course {
	private String name;
	private String type;
	private double grade;
	private int semester;
	private int gradeLevel;
	private int period;
	
	
	public Course(String name, String type, double grade, int semester, int gradeLevel, int period) {
		this.name = name;
		this.type = type;
		this.grade = grade;
		this.semester = semester;
		this.gradeLevel = gradeLevel;
		this.period = period;
	}
	
	public Course() {
		this.name = "Invalid";
		this.type = "Invalid";
		this.grade = -1;
		this.semester = 0;
		this.gradeLevel = 0;
		this.period = -1;
	}
	
	public double calculateCourseGPA() {
		int[] gpa_conversion = new int[]{97,93,90,87,83,80,77,73,71,70,0};
		double[] reg_conversion = new double[] {4,3.8,3.6,3.4,3.2,3.0,2.8,2.6,2.4,2.0,0};
		double[] honor_conversion = new double[] {4.5,4.3,4.1,3.9,3.7,3.5,3.3,3.1,2.9,2.5,0};
		double[] ap_conversion = new double[] {5,4.8,4.6,4.4,4.2,4,3.8,3.6,3.4,3,0};
		int index = -1;
		for (int i = 0; i < gpa_conversion.length; i++)
		{
			if (this.grade >= gpa_conversion[i])
			{
				index = i;
				break;
			}
		}
		if (this.type.equals("Reg"))
			return reg_conversion[index];
		if (this.type.equals("Honors"))
			return honor_conversion[index];
		if (this.type.equals("AP"))
			return ap_conversion[index];
		return -10000;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return  name + "," + type + "," + grade + "," + semester
				+ "," + gradeLevel + "," + period;
	}
	
	public String formattedToString () {
		return  name + "\t" + type + "\t" + grade + "\t" + semester
				+ "\t" + gradeLevel + "\t" + period;
	}
	public double compareGrade(Object o) {
		Course other = (Course) o;
		return this.grade - other.grade;
	}
	
	public int compareName(Object o) {
		Course other = (Course) o;
		return this.name.compareTo(other.name);
	}
	
	public int compareType(Object o) {
		Course other = (Course) o;
		return this.type.compareTo(other.type);
	}
	
	public int compareSemester(Object o) {
		Course other = (Course) o;
		return this.semester - other.semester;
	}
	
	public int compareGradeLevel(Object o) {
		Course other = (Course) o;
		return this.gradeLevel - other.gradeLevel;
	}
	
	public int comparePeriod(Object o) {
		Course other = (Course) o;
		return this.period - other.period;
	}
}
