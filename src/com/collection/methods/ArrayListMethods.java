package com.collection.methods;

import java.util.*;
//All ArrayList Methods and Constructor
public class ArrayListMethods extends ArrayList {

	public static void main(String[] args) {

		
		ArrayList al1=new ArrayList();
		ArrayListMethods al2=new ArrayListMethods();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);

		al2.ensureCapacity(15);			//1. Create ArrayList Object with Our Specified Capacity
		System.out.println(al2);
		
		al2.removeRange(2, 4); 			//2. Remove Element from begin index to end index-1
		System.out.println(al2);
		
		al2.trimToSize();				//3. Remove Empty Spaces From ArrayList
		System.out.println(al2);
		
	
// 	                <<<<<< CONSTRUCTOR >>>>>>		
//		ArrayList a1=new ArrayList();                      //Empty ArrayList With 10 Size
//		
//		ArrayList a2=new ArrayList(20);                    //Create ArrayList with Our Defined Size
//		
//		ArrayList a3=new ArrayList(Collection c)           //Conversion Constructor
//				
//		New Capacity =Current Capacity*3/2;	
	}

}
