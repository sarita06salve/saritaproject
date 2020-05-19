package com.java8features;

public class Exa1 
{
	public void doMuliply(int num)
	{
		int sum = 1;
		while(num>0)
		{
			int d = num % 10;
			System.out.print(d);
			sum = sum * d;
			num = num/10;	
		}
		System.out.println();
		System.out.println("Sum is :::" +sum);
	}
	public static void main(String[] args)
	{
		new Exa1().doMuliply(2378);

	}

}
