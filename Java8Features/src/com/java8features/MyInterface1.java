//An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, 
//static methods but can contain only one abstract method. It can also declare methods of object class.

//Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. 
//It is a new feature in Java, which helps to achieve functional programming approach.
package com.java8features;

public interface MyInterface1 
{
	void checkForInt();
	
	default void read()
	{
		System.out.println("Reading Book Rich Dad Poor Dad..");
	}
}
