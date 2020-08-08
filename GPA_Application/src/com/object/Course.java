package com.object;

public class Course {
	private String classId;
	private String name;
	private String level;
	
	public Course() {
		this.classId = "Invalid";
		this.name = "Invalid";
		this.level = "Invalid";
	}
	
	
	public Course(String classId, String name, String level) {
		this.classId = classId;
		this.name = name;
		this.level = level;
	}
	public String getCourseId() {
		return classId;
	}
	public void setCourseId(String classId) {
		this.classId = classId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return classId + "," + name + ",=" + level;
	}
	
	public int compareToClassId(Object o) {
		Course other = (Course) o;
		return this.classId.compareTo(other.classId);
	}
	
	public int compareToLevel(Object o) {
		Course other = (Course) o;
		return this.level.compareTo(other.level);
	}
	
	public int compareToName(Object o) {
		Course other = (Course) o;
		return this.name.compareTo(other.name);
	}
	
	
	
	
}
