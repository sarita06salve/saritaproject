//for each loop example1
package com.java8features;

import java.util.ArrayList;

public class Java8Exa2 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sarita");
		al.add("Priyanka");
		al.add("Deepali");
		al.add("Poonam");
		al.add("Snehal");
		
		System.out.println(al);
		
		al.forEach(a -> System.out.println(a));
	}
}
