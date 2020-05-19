//forEach Loop Example2
package com.java8features;

import java.util.HashMap;

public class Java8Exa3 
{
	public static void main(String args[])
	{
		HashMap<String, String> sh = new HashMap<>();
		sh.put("101", "Java");
		sh.put("102","Python");
		sh.put("103", "C++");
		sh.put("104", ".net");
		
		sh.forEach((a,b) -> new Java8Exa3().getData(a,b));
	}
	
	void getData(String a , String b)
	{
		System.out.println(a + "\t" + b);
	}
	
}
