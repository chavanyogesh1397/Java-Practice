package first;

import java.util.Scanner;

public class AdditionInput 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//String x= sc.next();
		System.out.println("Enter First Number: ");
		int a= sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b= sc.nextInt();
		System.out.println("Addition is: " + (a+b));
	}
}
