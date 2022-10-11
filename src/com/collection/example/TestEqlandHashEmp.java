package com.collection.example;

import java.util.*;
public class TestEqlandHashEmp {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		Employee1 e1=new Employee1(10,"A");
		Employee1 e2=new Employee1(10,"A");
		Employee1 e3=new Employee1(10,"A");
		h.add(e1);
		h.add(e2);
		h.add(e3);
		System.out.println(h);
	}
}
class Employee1{
	int id;
	String name;
	Employee1(){
		super();
	}
	Employee1(int id,String name){
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
		if(obj instanceof Employee1) {
			Employee1 emp=(Employee1)obj;
			return id==emp.id && name.equals(emp.name);
		}
		else
			return false;
	}
	public String toString() {
		return "Employee1[ID="+id+",Name="+name+"]";
	}
}