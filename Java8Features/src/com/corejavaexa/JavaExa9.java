package com.corejavaexa;

import java.util.*;

public class JavaExa9 
{
	public static void main(String args[])
	{
		try
		{
			List<Employee> list = new ArrayList<>();
			list.add(new Employee(1,"Sarita","9664167304"));
			list.add(new Employee(2,"Deepali","9867993896"));
			
			Comparator<Employee> d2 = (a,b) -> {
				return (a.getEmp_mobile().compareTo(b.getEmp_mobile()));
			};
			
			Collections.sort(list,d2);
			
			System.out.println(list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
