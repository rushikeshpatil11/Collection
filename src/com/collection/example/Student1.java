package com.collection.example;

public class Student1 implements Comparable {
	int roll;
	String name;

	Student1() {

	}

	Student1(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Student1 s=(Student1)o;
		if(roll<s.roll)
			return -1;
		else if(roll>s.roll)
			return +1;
		else
			return 0;
	}
	public String toString() {
		return "Student[ Roll:"+roll+",Name:"+name+"]";
	}

}
