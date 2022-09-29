package com.collection.cursor;

import java.util.*;
//All Enumeration Methods
public class EnumerationDemo {

	public static void main(String[] args) {

		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println(v);
		Enumeration e=v.elements();
		
		e.hasMoreElements();            //1. Checks More Element Present (True) or Not(False)
		
//		e.nextElement();				//2. Return Next Element 
		
		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		
	}
}
