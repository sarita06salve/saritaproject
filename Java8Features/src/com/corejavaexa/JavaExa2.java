package com.corejavaexa;

public class JavaExa2 
{
	void checkException()
	{
		try
		{
			System.out.println("I am first try of this block...");
			try
			{
				System.out.println("I am second try of this block...");
				String s = null;
				s = s.trim();
				
				System.out.println("My work is done..");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("I am second catch of this class...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("I am first catch of this class...");
		}
		System.out.println("I am going to be printed surely..");
	}
	
	public static void main(String args[])
	{
		new JavaExa2().checkException();
	}
}
