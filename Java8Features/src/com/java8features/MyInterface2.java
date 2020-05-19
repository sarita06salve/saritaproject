package com.java8features;

public interface MyInterface2 
{
	void checkForInt();
	
	
	 default void read() {
		 System.out.println("Reading 7Habits of Reach People.."); }
	 
	
	default void myMethod(String s)
	{
		s = "Hey.. This is new Java Features...";
		System.out.println("..."+s);
	}
}
