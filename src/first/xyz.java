package first;

import java.util.ArrayList;

public class xyz {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(0, "Yogesh");
		a.add(1, "Akash");
		a.add(2, "Ranjit");
		a.add(3, "Rohit");
		a.add(4, "Kartik");
		System.out.println(a);
		System.out.println("Before removing");
		System.out.println(a.size());
		System.out.println(a.remove(0));
		System.out.println("After Removing");
		System.out.println(a);
		System.out.println("after removing size");
		System.out.println(a.size());
		System.out.println("insert element between the program");
		a.add(1, "Sagar");
		System.out.println(a);
		for(Object y : a)
				{
					System.out.println(y);
				}
	
		
		
	}

}
