package com.collection.example;

public class Employee {
	int id;
	String name;
	String dept;
	int salary;

	Employee() {

	}

	Employee(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		if (this == null)
			return false;
		if (this == o)
			return true;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			return id == e.id && name.equals(e.name) && dept.equals(e.dept) && salary == e.salary;
		} else
			return false;
	}

	public String toString() {
		return "Emp[" + id + "," + name + "," + dept + "," + salary + "]";
	}

}
