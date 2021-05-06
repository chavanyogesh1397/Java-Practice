package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ABC 

{
	
	public static void main(String[] args) 
	{
		//HashMap h1= new HashMap();
		HashMap <Integer,String> h1 = new HashMap<Integer,String>();
		
		h1.put(0,"Yogesh");
		h1.put(1,"Saghar");
		h1.put(2,"akash");
		h1.put(3,"Ranjit");
		System.out.println(h1.size());
		System.out.println(h1);
		System.out.println("After Removing");
		System.out.println(h1.remove(1));
		System.out.println(h1);
		for (Map.Entry ty : h1.entrySet())
		{
			
		System.out.println("ID:" + ty.getKey() + " Name:" + ty.getValue());
		
		}
		
	}
}
