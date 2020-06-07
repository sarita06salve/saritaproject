/*
 * Polymorphism : Poly means many forms.. A class has multiple methods..
 * Method Overloading :-  Method Overloading is a process where a class has multiple methods with same name but different parameters.
 */
package com.corejavaexa;

public class JavaExa1 
{
	int addData(int a , int b)
	{
		int c = a+b;
		return c;
	}
	
	int addData(long a , long b)
	{
		long c = (a*b);
		int multi = (int)(long)c;
		return multi;
	}
	
	public static void main(String args[])
	{
		int a = new JavaExa1().addData(85,79);
		int b = new JavaExa1().addData(850,9856);
		
		System.out.println("For Integer Value [a] "+a + "\t" + "For Long Value [b] "+b);
	}
}
