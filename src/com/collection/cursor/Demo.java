package com.collection.cursor;

import java.util.*;

public class Demo extends ArrayList
{
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		Demo d=new Demo();
		
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		System.out.println("Before Removing Range 2 to 4 =>"+d);
		d.removeRange(2, 4);
		System.out.println("After Removing Range 2 to 4 =>"+d);
		
		
		
		
		
	}

}
