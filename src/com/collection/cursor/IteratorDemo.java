package com.collection.cursor;

import java.util.*;
//It is Universal Cursor Applicable for All Collection (1.2 version)
public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator itr = al.iterator();
		
		itr.hasNext();           //1. If next Element Present then return true or Not Present then return false
		
		itr.next();				 //2. Return next Element(Object)   
		
		itr.remove();			 //3. Remove this Element From List
		

		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i == 30)
				itr.remove();
		}
		System.out.println("After Removal ==>"+al);
	}
}
