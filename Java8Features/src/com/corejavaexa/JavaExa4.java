package com.corejavaexa;

public class JavaExa4 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println("Value of i is ===" +i);
			}
			System.out.println(Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		JavaExa4 e1 = new JavaExa4();
		JavaExa4 e2 = new JavaExa4();
		JavaExa4 e3 = new JavaExa4();
		e1.setName("Sarita Salve");
		e1.start();
		
		try
		{
			e1.join();
		}
		catch(Exception e) {e.printStackTrace();}
		
		e2.start();
		e3.start();
		System.out.println("***"+e1.getName());

	}

}
