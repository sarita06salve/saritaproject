package com.corejavaexa;

public class FinalThread extends Thread
{

	public static void main(String[] args) 
	{
		boolean b1 = true;
		MyThread1 t1 = new MyThread1();
		Thread t2 = new MyThread2();
		
		t1.start();
		t2.start();

	}

}
