package first;

import java.util.Scanner;

public class ArrayScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int x[] = new int[10];
		for(int j=0;j<10;j++)
		{
			
			System.out.println(j);
			x[j] = sc.nextInt();
			
		}
		for(int i: x)
		{
			System.out.println(i);
		}
		
		
	}
}
