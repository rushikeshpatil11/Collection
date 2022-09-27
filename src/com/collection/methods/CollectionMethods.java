package com.collection.methods;

import java.util.*;
//All Collection Methods
public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al1.add(10);      					//1. Adding element in Collection
		al1.add(20);
		al1.add(30);
		al2.add(10);
		al2.add(20);
		al2.add(30);
		
		al1.addAll(al2);					//2. Adding One Collection to Other Collection
		
		al1.remove(2);						//3. Remove Element From Specified Index
		
//		al1.removeAll(al2);				    //4. Remove One Collection From Other Collection
		
		al1.contains(10);					//5. Checks the Specified Element Present(true) or Not(false)
		
		al1.containsAll(al2);				//6. Checks the Specified Collection Present(true) or Not(false)
		
		al1.retainAll(al2);					//7. Retain Only Specified Collection All Other Remove
		
		al1.isEmpty();						//8. Checks the Collection is Empty(true) or Not(false)
		
		al1.size();							//9. Return the  Size of Collection (no. of element present)
		
//		al1.clear();						//10. Delete All Elements From the Collection
		
		al1.equals(al2);					//11. Checks Contain Equality If Equal(true) or Not(false)
		
		al1.hashCode();						//12. Return HashCode Number(40051) If Contain Same then Same HashCode
		
		al1.toArray();						//13. Convert Collection into Object[] Array
		
		al1.iterator();						//14. Return Object Of Iterator Implemented Class (Iterator-Cursor)
		
		
		System.out.println(al1);

		
	}

}
