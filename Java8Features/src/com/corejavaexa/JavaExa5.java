package com.corejavaexa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaExa5 implements Comparator<Laptop>
{
	public static void main(String args[])
	{
		ArrayList<Laptop> al = new ArrayList<>();
		al.add(new Laptop(1,"Dell","4GB"));
		al.add(new Laptop(2,"Acer", "2GB"));
		al.add(new Laptop(4, "Asus" ,"16GB"));
		al.add(new Laptop(3,"HP","8GB"));
		
		Comparator<Laptop> l1 = (o1,o2) ->
		{
			return o1.getLapBrnd().compareTo(o2.getLapBrnd());
		};
				
		Collections.sort(al, l1);		
		al.forEach((x) -> System.out.println(x));
		
		/*
		 * Collections.sort(al);
		 * 
		 * al.forEach((x) -> System.out.println(x));
		 */	}

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	/*
	 * @Override public int compare(Laptop o1, Laptop o2) { return
	 * o1.getLapBrnd().compareTo(o2.getLapBrnd()); }
	 */
}
