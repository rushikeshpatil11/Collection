package com.collection.example;

import java.util.*;

class Student {
	int roll;
	String name;

	Student() {
		super();
	}
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public int hashCode() {
		return roll;
	}
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return roll == std.roll && name.equals(std.name);
		} else
			return false;
	}
	public String toString() {
		return "Student[Roll=" + roll + ", Name=" + name + "]";
	}
}

public class TestEqlandHashStd {
	public static void main(String[] args) {

		HashSet h = new HashSet();
		Student s1 = new Student(10, "Rohit");
		Student s2 = new Student(20, "Rushi");
		Student s3 = new Student(10, "Rohit");
		Student s4 = new Student(20, "Rushi");
		Student s5 = new Student(30, "Patil");

		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);

		System.out.println(h);
	}
}