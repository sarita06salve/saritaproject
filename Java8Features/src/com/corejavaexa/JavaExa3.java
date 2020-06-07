package com.corejavaexa;

import java.util.HashMap;

public class JavaExa3 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Sarita");
		map.put(2, "Priyanka");
		map.put(3, "Deepali");
		map.put(4, "Sneha");
		map.put(5, "Jahnvi");
		
		//I am advance for Loop			
		for(int s : map.keySet())
		{
			System.out.println(s + "\t" + map.get(s));
		}
		
		//I am forEach Loop
		map.forEach((x,y) -> System.out.println(x + "\t" +y));

	}

}
