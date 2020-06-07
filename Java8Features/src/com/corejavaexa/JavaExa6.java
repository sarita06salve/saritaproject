package com.corejavaexa;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaExa6 {

	public static void main(String[] args)
	{
		String a = "Hello World";
 		ArrayList<String> al = new ArrayList<String>();
 		
 		StringTokenizer stringTokenizer = new StringTokenizer(a, " ");
 		while(stringTokenizer.hasMoreElements())
 		{	
 			al.add(stringTokenizer.nextToken());
 		}
 		System.out.println(al.get(1) + "\t" + al.get(0));
	}

}
