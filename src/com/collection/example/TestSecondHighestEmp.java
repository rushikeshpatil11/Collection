package com.collection.example;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestSecondHighestEmp {

	public static void main(String[] args) {

		Employee e1 = new Employee(45, "AA", "Test", 4234);
		Employee e2 = new Employee(30, "DD", "Dev", 1234);
		Employee e3 = new Employee(20, "EE", "Test", 4134);
		Employee e4 = new Employee(40, "BB", "Dev", 3234);
		Employee e5 = new Employee(25, "CC", "Dev", 2234);

		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println("ArrayList:==>" + al);
		TreeSet t = new TreeSet(new CompareWithSalary());
		t.addAll(al);
		al.removeAll(al);
		al.addAll(t);
		System.out.println("Second Highest Salary Emp:==>" + al.get(al.size() - 2));

	}

}
