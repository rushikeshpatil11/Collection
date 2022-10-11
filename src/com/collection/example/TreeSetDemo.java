package com.collection.example;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		Student1 s1=new Student1(510,"Ram");
		Student1 s2=new Student1(310,"Rohit");
		Student1 s3=new Student1(0,"Rushi");
//		Employee e1=new Employee(0,"Rushi");
		
		
		TreeSet t=new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
//		t.add(e1);
		System.out.println(t);

	}

}
