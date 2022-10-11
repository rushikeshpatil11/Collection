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
 *		6.Comparator comparator();                           ==> Return Comparator Object which is used in this Set
 *
 *
 *
 *	 			<<<<<<<< NavigableSet (I==1.6V) >>>>>>>>
 *		1.It is Child Of SortedSet
 *		2.It give some method for Navigation purpose
 *
 *	**METHODS==>
 *		1.E lower(E e);      								             ==> Return Immediate Small Element from this Element
 *		2.E higher(E e); 								            	 ==> Return Immediate Large Element from this Element
 *		3.E floor(E e);												   	 ==> Return less than or equal to Element from this Element
 *		4.E ceiling (E e); 												 ==> Return greater than or equal to Element from this Element
 *		5.Iterator iterator();											 ==> Return iterator object over Element in Ascending order
 *		6.Iterator decsendingIterator();								 ==> Return iterator object over Element in descending order
 *		7.NavigableSet descendingSet();									 ==> Return reverse order view of this Set
 *		8.NavigableSet subset(E fromE,boolean incl,E toE,boolean incl);  ==> Return Nset (FromE to toE) with fine control(<=,>=)
 *		9.NavigableSet headSet(E toE , boolean incl); 					 ==> Return Nset (< toE) with fine control(<=)
 *		10.NavigableSet tailSet(E fromE , boolean incl); 				 ==> Return Nset (fromE <=) with fine control(<=)
 *
 *
 *
 *				<<<<<<<< TreeSet (CC=1.2V) >>>>>>>>
 *		1.It is Child of Navigable Set
 *		2.Duplicates not allowed
 *		3.Insertion order not Preserved (But Element Store on some sorting order)
 *		4.Only Homogeneous element allowed
 *		5.No null element are allowed (From 1.7 onwards no null element are allowed)
 *		
 *	**CONSTRUCTOR==>
 *		1.TreeSet t=new TreeSet();               ==> This is for Default Natural Sorting Order (Ascending Order)
 *										             For this <i> Elements must be Homogeneous required
 *												              <ii> Element must be Comparable
 *
 *		2.TreeSet t=new TreeSet(SortedSet s);	 ==> This is for SortedSet Object
 *
 *		3.TreeSet t=new TreeSet(Comparator c);   ==> This is for Customized Sorting Order
 *
 *		4.TreeSet t=new TreeSet(Collection c);   ==> Conversion Constructor
 *
 *
 *
 *Difference between Comparable and Comparator ===:
 *
 *							 Comparable 				Comparator
 *
 *1.USEDFOR:=					D.N.S.O					  C.S.O
 *2.LOCATION:=				  lang package			  util package
 *3.NOMETHOD:=				      One				      Two
 *4.METHODS:=				(i)comareTo()			   (i)campare()
 *													   (ii)equals()
 *5.AFFECT-CLASS:=          Affect Original          Not Affect Original 
 *								class						class
 *6.SORTING-SEQ:=			 Only one					Multiple
 *7.EX:=					  String,etc                
 *
 *
 *
 *
 *Difference between HashSet , LinkedHashSet and TreeSet ==:
 *
 *							HashSet             LinkedHashSet         	 	  TreeSet
 *
 *1.VERSION:= 		    	 1.2 V               1.4 V                 		  1.2 V
 *2.D.S. :=					Hashtable         Hashtable+D-LinkedList         BalancedTree
 *3.INSERTION-ORDER:=		   No					Yes                         No
 *4.ELEMENT-TYPE:=		   Heterogeneous      Heterogeneous                  Homogeneous
 *5.DUOLICATES:=				No                  No							No
 *6.SORTING:=                   No			    	No							Yes
 *7.NULL :=						Yes 			    Yes 						No(From 1.7V)
 *8.CONSTRUCTOR:=               4                    4                           4
 *9.TIME-COMPLEX:=             O(n)                  O(n)						log(n)
 *10.METHODS:=            i)All From 				 i)All From				i)From SortedSet and  
 *							Collection				Collection					NavigableSet
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
