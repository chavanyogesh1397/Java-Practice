package first;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList 
{
	public static void main(String[] args) 
	{
		String i[]= new String [5];
		ArrayList a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<5;j++)
		{
			 i[j]=sc.next();
		}
		for(String x: i)
		{
			System.out.println(x);
		}
	}
}
