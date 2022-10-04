package com.collection.methods;

import java.util.Comparator;

public class SetHashSetLinkedHashSet {

	public static void main(String[] args) {

/*        			<<<<<<<< Set (I=1.2V) >>>>>>>>
 * 		1.Child of Collection Interface
 * 		2.Duplicates not allowed
 * 		3.Insertion Order Not Preserved
 * 		4.Only One null insertion possible
 * 		5.Heterogeneous element allowed
 * 		6.Set Not Contain Any Method
 * 
 *  
 *  				<<<<<<<< HashSet (CC=1.2V) >>>>>>>>
 *  	1.Underlying D.S. is Hash table
 *  	2.Child of Set Interface
 *  	3.Duplicates not allowed
 *  	4.Insertion Order not Preserved
 *  	5.Only one null insertion possible 
 *  	6.Heterogeneous element allowed
 *  	7.Implements Set , Serializable and Cloneable
 *  	8.Use when freq. Operation is Search
 *  	9.If we trying to add duplicates then no CTE or RTE its simply add() returns "false"
 *  	10.No contain Any Method
 *  
 *  **CONSTRUCTORS===>
 *  	1.HashSet h=new HashSet();                          ==> Create Empty HS object with capacity 16 and Fill Ratio 0.75
 *  
 *  	2.HashSet h=new HashSet(int Initial capacity);      ==> Create Empty HS object with our Specified Capacity
 *  
 *  	3.HashSet h=new HashSet(int in-capacity,float FR);  ==> Create Empty HS object with our Specified Capacity and Fill Ratio/Load Factor
 *  
 *  	4.HashSet h=new HashSet(Collection c); 				==> Conversion Constructor
 *  
 *  **NOTE===>
 *  	1.Default Initial Capacity = 16  (Index Range 0 to 15)
 *  	2.Default FillRatio/LoadFactor = 0.75
 *		3.Incremental formula = 2^n+1;  (Initial 'n'= 4)  
 *		4.Threshold = Initial capacity * FillRatio;   (eg.- 12=16*0.75)
 *
 *
 *	**FillRatio/LoadFactor==>
 *		After filling how much ratio a new HashSet Object will be created that ratio is called as FillRatio/LoadFactor
 *
 *
 *	**Hash Collision==>
 *		A Hash Collision is Hash Map is a situation where two or more key object produce the same final hash value and pointing to same bucket or array index
 *  By using singly LinkedList this problem is resolved 
 *  From java 8 if one bucket contain more than 8 Objects then this Singly LinkedList convert into balanced tree for performance improvement purpose
 *  
 *  
 *  **HashSet Internal Work==>
 *  	Internally add method call put method of HashMap , add method accept object(Element) but put method take object as a key and corresponding
 *  value is dummy value i.e. PRESENT . put method return old value and old value is null then key successfully insert and add method return true.
 *  
 *  
 *  			<<<<<<<< LinkedHashSet (CC=1.4V) >>>>>>>>
 *  	1.Underlying D.S. is Doubly LinkedList and Hash table
 *  	2. It is Child of HashSet
 *  	3.Duplicates not allowed
 *  	4.Insertion order preserved
 *  	5.It contain same method and constructor as HashSet
 *  
 *  **Difference between HashSet and LinkedHashSet==>
 *  		HashSet				                    LinkedHashSet
 *  1.Underlying DS is HashTable          1.Underlying DS is DoublyLinkedList and HashTable
 *  2.Insertion order not Preserved       2.Insertion order Preserved 
 *  3.Introduce in 1.2 version            3.Introduce in 1.4 version
 *  
 * 	
 * **CONSTRUCTORS===>
 *  	1.LinkedHashSet h=new LinkedHashSet();                          ==> Create Empty LHS object with capacity 16 and Fill Ratio 0.75
 *  
 *  	2.LinkedHashSet h=new LinkedHashSet(int Initial capacity);      ==> Create Empty LHS object with our Specified Capacity
 *  
 *  	3.LinkedHashSet h=new LinkedHashSet(int in-capacity,float FR);  ==> Create Empty LHS object with our Specified Capacity and Fill Ratio/Load Factor
 *  
 *  	4.LinkedHashSet h=new LinkedHashSet(Collection c); 				==> Conversion Constructor
 *  
 *  
 *  
 *
 *				<<<<<<<< SortedSet (I==1.2V) >>>>>>>>
 *		1.It is Child of Set
 *		2.If we want to Store Objects with some sorting order without duplicates then go for SortedSet
 *		
 *	
 *	**METHODS==>
 *		1.E first();     									 ==> Return 1st Element of Set
 *		2.E last();    									     ==> Return last Element of Set
 *		3.SortedSet headSet(Element e);                      ==> Return Elements Which is Less than 'e' (i.e. : <e)
 *		4.SortedSet tailSet(Element e);                      ==> Return Elements Which is Greater than Equal to 'e' (i.e. : >=e)
 *		5.SortedSet subSet(E beginElement , E endElement);   ==> Return Set Begin to End-1  
 *		6.Comparator comparator();                           ==>
 *
 *
 *
 *  	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	}
}
