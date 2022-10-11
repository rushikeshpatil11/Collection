package com.collection.methods;

import java.util.*;

public class TreeSetMethods {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(30);
		t.add(50);
		t.add(20);
		t.add(40);
			
//							<<<< SORTEDSET METHODS >>>>	
		
		System.out.println(t.first());  		//1.Return First ELement of this Set
		
		System.out.println(t.last()); 			//2.Return Last Element of this Set
		
		System.out.println(t.headSet(30));    	//3.Return *View* of SortedSet which is less than 30 (Exclusive)
		
		System.out.println(t.tailSet(20)); 		//4.Return *View* of SortedSet which is greater than and equal to 20 (Inclusive)
		
		System.out.println(t.subSet(20,50)); 	//5.Return *View* of SortedSet which Element Greater than equal to 20 but less than 50 (E ,E-1)

		System.out.println(t.comparator());		//6.Return Comparator Object Which use used for Creation the TreeSet
		
		
//							<<<< NAVIGABLESET METHODS >>>>
		
		System.out.println(t.lower(10));        //1.Return the Immediate lesser Element from this Element(Exclusive) ( <10:-null),if not Present then return null
		
		System.out.println(t.higher(35));		//2.Return the Immediate Bigger Element from this ELement(Exclusive) (35<:-40),if not Present then return null
		
		System.out.println(t.floor(20));		//3.Return the Immediate less&equal Element from this Element(Inclusive) (20>= :-20),if not Present then return null
		
		System.out.println(t.ceiling(31)); 		//4.Return the Immediate Big&equal Element from this Element(Inclusive) (31<=:-40),if not Present then return null
		
		System.out.println(t.descendingSet());  //5.Return the Reverse order view of this set
		
		t.iterator(); 							//6.Return the Iterator Object which gives Ascending Order
		
		t.descendingIterator(); 				//7.Return the Iterator Object which gives Descending Order
		
		
	}

}
