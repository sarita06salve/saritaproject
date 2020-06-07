package com.corejavaexa;

import java.util.*;

public class JavaExa8 
{
	public static void main(String[] args) 
	{
		try
		{
			List<Employee> empList = new ArrayList<Employee>();
			Employee e1 = new Employee(1,"Sarita Salve","9664167304");
			Employee e2 = new Employee(1,"Sarita Salve","9664167304");
			
			System.out.println("*** 1 ****" +e1.equals(e2));
			
			empList.add(e2);
			empList.add(e1);
			
			System.out.println("***2 ****" + empList.size());
			
			String s1 = new String("Sarita");
			String s2 = new String("Sarita");
			
			System.out.println("*** 3 ****" + s1.equals(s2));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
