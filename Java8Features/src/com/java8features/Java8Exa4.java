//forEach Loop Example--3
package com.java8features;

import java.util.Collections;
import java.util.HashSet;

public class Java8Exa4 
{
	public static void main(String args[])
	{
		HashSet<Integer> sh = new HashSet<>();
		sh.add(101);
		sh.add(106);
		sh.add(105);
		sh.add(110);
		sh.add(108);
		
		sh.forEach((num) -> System.out.println(num));
	}
}
