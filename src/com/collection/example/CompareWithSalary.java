package com.collection.example;

import java.util.Comparator;

public class CompareWithSalary implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		Integer i1=e1.salary;
		Integer i2=e2.salary;
		
		return i1.compareTo(i2);
	}

}
