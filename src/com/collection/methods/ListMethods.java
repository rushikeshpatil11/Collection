package com.collection.methods;

import java.util.*;
//All List Methods
public class ListMethods {

	public static void main(String[] args) {

		ArrayList al1=new ArrayList();
		
		al1.add(10);      					
		al1.add(20);
		al1.add(10);
		
		al1.get(2);								   //1. Return the Element of Specified Index
		System.out.println(al1.get(2));
		
		al1.set(1, 40);							   //2. Replace the Element of Specified Index and Return Old Value
		System.out.println(al1);
		
		al1.indexOf(10);						   //3. Return the Index of Specified Element If not Present then Return -1 
		System.out.println(al1.indexOf(10));
		
		al1.lastIndexOf(10);					   //4. Return the LastIndex of Specified Element If not Present then Return-1 
		System.out.println(al1.lastIndexOf(10));
		
		List l1=al1.subList(1,3);				   //5. Return List view From begin index to last index-1 and we can perform Operation also that list
		l1.add(12);
		System.out.println(l1);
		
		al1.listIterator();						   //6. Return Object of ListIterator Implemented Class Start from first or last index
		
		al1.listIterator(2);					   //7. Return Object of ListIterator Implemented Class Start from Specified Index
		
		System.out.println(al1);
		
		
	}

}
