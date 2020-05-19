package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

public class Java8Exa5 implements Drawable
{

	public static void main(String[] args) {
		
		int a[] = {1,3,5};
		int b[] = {2,4,6};
		
		Drawable d1 = (x,y) -> {
			
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<x.length;i++)
			{
				al.add(x[i]);
			}
			
			for(int j=0;j<y.length;j++)
			{
				al.add(y[j]);
			}
			
			Collections.sort(al);
			
			System.out.println(al);
		};
		d1.convertArrayToList(a, b);
	}

	@Override
	public void convertArrayToList(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
	}
}
