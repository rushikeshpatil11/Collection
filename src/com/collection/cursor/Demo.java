package com.collection.cursor;

import java.util.*;

public class Demo 
{
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());	
			
		}
	}
}
