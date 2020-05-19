package com.java8features;

public class Java8Exa1 implements MyInterface1,MyInterface2
{
	/*
	 * void readBooks(String s) { s.concat("I am reading Book..");
	 * System.out.println("Value of s is :::::::::" +s); }
	 */
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hi...");
		//new Java8Exa1().readBooks("I am watching Television..");
		new Java8Exa1().read();
	}

	@Override
	public void checkForInt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		MyInterface2.super.read();
	}

	/*
	 * @Override public void read() { // TODO Auto-generated method stub
	 * MyInterface1.super.read(); }
	 */

	/*
	 * @Override public void read() { // TODO Auto-generated method stub
	 * MyInterface2.super.read(); }
	 */
}
