package com.collection.cursor;

import java.util.*;

//It is Applicable Only for List Objects (1.2 version)
public class ListIteratorDemo {

	public static void main(String[] args) {

		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ListIterator ltr1=al.listIterator();       //One way its Start From 0 index
		
		ListIterator ltr2=al.listIterator(3);      //Second way its Start From 3 index
		
		
		ltr1.next();                              //1. Return next Element (Object)
		
		ltr1.hasNext();							  //2. If next Element Present then return true or Not Present then return false
		
		ltr1.nextIndex();						  //3. Return Index Of next Element
		
		ltr1.previous();						  //4. Return previous Element (Object)
		
		ltr1.hasPrevious();						  //5. If previous Element Present then return true or Not Present then return false
		
		ltr1.previousIndex();					  //6. Return Index Of previous Element
		
//		ltr1.add(60);							  //7. Add the Element while iterating into Specific Index (if(condition))
							
//		ltr1.set(30);							  //8. Replace the Element while iterating into Specific Index (if(condition))
		
//		ltr1.remove();                            //9. Remove the Element while iterating from Specific Index (if(condition))
		
		
		while(ltr1.hasNext()) {						        //Forward Direction
			Integer i=(Integer) ltr1.next();
			if(i==20)
				ltr1.set(00);
		}System.out.println(al);
		
		
		while(ltr1.hasPrevious()) {							//Backward Direction
			Integer j=(Integer) ltr1.previous();
			if(j==20)
				ltr1.set(00);
		}System.out.println(al);
		
	}

}
