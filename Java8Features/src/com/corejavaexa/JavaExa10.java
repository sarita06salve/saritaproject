package com.corejavaexa;

import org.json.JSONObject;

public class JavaExa10 {

	public static void main(String[] args) 
	{
		try
		{
			JSONObject o1 = new JSONObject();
			
			JSONObject finData = new JSONObject();
			o1.put("1", "Java");
			o1.put("2", "C++");
			o1.put("3", "Python");
			o1.put("4", "Javascript");
			o1.put("5", "XSL");
			
			finData.put("data", o1);
			
			System.out.println("Final Json String is :::" +finData.toString());
			
			if(finData.has("data"))
			{
				JSONObject obj = finData.getJSONObject("data");
				
				System.out.println("123456 :::" + obj.toString());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
