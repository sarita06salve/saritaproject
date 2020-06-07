package com.corejavaexa;

public class MyThread2 extends Thread
{
	public void run()
	{
		String s = "Sarita Salve";
		
		System.out.println("Provided String is ==" +s);
		for(int i = 0; i<s.length();i++)
		{
			System.out.println("String character at ["+i+"] position is "+s.charAt(i));
		}
	}
}
