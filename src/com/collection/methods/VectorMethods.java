package com.collection.methods;

import java.util.*;
//All Vector Methods and Constructor
public class VectorMethods {

	public static void main(String[] args) {
		Object o[]=new Object[8];
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		
		v.addElement(40);						//1. Adding Element at last of this Vector
		
		v.firstElement();						//2. Return First Element of this Vector
		
		v.lastElement();						//3. Return Last Element of this Vector
		
		v.elementAt(2);							//4. Return the Element of Specified Index
		
		v.setElementAt(00, 0);					//5. Replace Element at Specified Index
		
		v.insertElementAt(10, 1);				//6. Insert Element at Specified Index
		
		v.removeElementAt(0);					//7. Remove Element from Specified Index
		
//		v.removeElement(10);					//8. Remove Element From this Vector
		
//		v.removeAllElements();					//9. Remove All Elements From this Vector
		
		v.capacity();							//10. Return the Current Capacity of this Vector
		
		v.size();								//11. Return the Current Size of this Vector
		
		v.setSize(8);							//12. Set the new Size to this Vector
		
		v.trimToSize();							//13. Remove Empty Spaces From this Vector (Ensure size=capacity)
		
		v.isEmpty();							//14. Checks the this Vector is Empty(True) or Not(False)
		
		v.copyInto(o);						    //15. Copy All Element From Vector into Array
		
		Enumeration e=v.elements();				//16. Return Object of Enumeration Implemented class (Cursor)
		
		System.out.println(v);
		
		for(Object num:o)
			System.out.println(num);
		
		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		
		
//									<<<<<< CONSTRUCTOR >>>>>>
//		
//	 1. Vector v=new Vector();                 	// Creates Empty Vector with Default Capacity 10
//	 
//	 2. Vector v=new Vector(15);                // Creates Empty Vector with Our Specified Initial Capacity 15
//	 
//	 3. Vector v=new Vector (15,3);				// Creates Empty Vector with Capacity 15 but Increment with 3 Every time
//	 
//	 4. Vector v=new Vector (Collection c);     // Conversion Constructor
//	 
//	 New Capacity =Current Capacity*2;

	}
}
