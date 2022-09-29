package com.collection.methods;

import java.util.*;

//All Stack Methods And Constructor
public class StackMethods {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		
		s.empty();								//1. Checks the this Stack is Empty(True) or Not(False)
		
		s.push(40);								//2. Add the Element at Top of this Stack
		
		s.peek();								//3. Return the Top Element from this Stack but Not Remove
		
		s.pop();								//4. Return and Remove the Top Element from this Stack
		
		s.search(10);							//5. Return Offset of this Element from this Stack (Position From Top) If not Present then -1
		
		System.out.println(s);
		
//  			    <<<<<<< CONSTRUCTOR >>>>>>>	
// 		1. Stack s=new Stack();             // Creates Empty Stack	

		
	}

}
