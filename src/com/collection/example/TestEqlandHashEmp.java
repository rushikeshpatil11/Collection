package com.collection.example;

import java.util.*;
public class TestEqlandHashEmp {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		Employee e1=new Employee(10,"A");
		Employee e2=new Employee(10,"A");
		Employee e3=new Employee(10,"A");
		h.add(e1);
		h.add(e2);
		h.add(e3);
		System.out.println(h);
	}
}
class Employee{
	int id;
	String name;
	Employee(){
		super();
	}
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(this==null)
			return false;
		if(obj instanceof Employee) {
			Employee emp=(Employee)obj;
			return id==emp.id && name.equals(emp.name);
		}
		else
			return false;
	}
	public String toString() {
		return "Employee[ID="+id+",Name="+name+"]";
	}
}