package com.collection.methods;

import java.util.*;

//All LinkedList Methods and Constructor
public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.addFirst(10);					//1. Add the Element at Beginning of this List
		
		l1.addLast(20);						//2. Add the Element at End of this List
		
		l1.getFirst();						//3. Return the First Element of this List
		
		l1.getLast();						//4. Return the Last Element of this List
		
		l1.offer(10);						//5. Add Element at last of this list and return true if not then false
		
		l1.offerFirst(20);                  //6. Add Element at First of this list and return true if not then false
		
		l1.offerLast(30);					//7. Add Element at last of this list and return true if not then false
		
		l1.element();						//8. Return First Element(Head) but does not Remove
		
		l1.peek();							//9. Return First Element(Head) but does not Remove
		
		l1.peekFirst();						//10. Return First Element(Head) but does not Remove if Empty then return null
		
		l1.peekLast();						//11. Return Last Element(Tail) but does not Remove if Empty then return null
		
		l1.poll();   						//12. Return and Remove First Element(Head)
		
		l1.pollFirst();						//13. Return and Remove First Element(Head) of this list if Empty then return null
		
		l1.pollLast();						//14. Return and Remove Last Element(Tail) of this list if Empty then return null
		
		l1.pop(); 							//15. Return the Element From 0 index
		
		l1.push(90);						//16. Add the Element at 0 index
		
		l1.removeLast();					//17. Return and Remove the last Element of this list
		
		l1.removeFirstOccurrence(10);  		//18. Remove First Occurrence of Specified Element from Head to Tail
		
		l1.removeLastOccurrence(10);        //19. Remove Last Occurrence of Specified Element from Head to Tail
		
		l1.descendingIterator();      		//20. Return the Iterator in Reverse order
		
		System.out.println(l1);
		
		
//		            <<<<<<CONSTRUTCOR>>>>>>>
//		
//		LinkedList l1=new LinkedList();                 //Create Empty LinkedList Object
//		
//		LinkedList l2=new LinkedList(Collection c);     //Conversion Constructor
		
		
	}

}
