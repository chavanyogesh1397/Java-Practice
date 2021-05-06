package first;

import java.util.Scanner;

public class Calculater 
{
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;
	public void Sum()
	{
		System.out.println("Enter 1st No: ");
		a=sc.nextInt();
		System.out.println("Enter 2nd No: ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum: "+ c);
	}
	public void Mult()
	{
		System.out.println("Enter 1st No: ");
		a=sc.nextInt();
		System.out.println("Enter 2nd No: ");
		b=sc.nextInt();
		c=a*b;
		System.out.println("Multiplicton: "+ c);
	}
	public void Div()
	{
		System.out.println("Enter 1st No: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd No: ");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division: "+ c);
	}
	public static void main(String[] args) 
	{
		Calculater c =new Calculater();
		c.Sum();
		c.Mult();
		c.Div();
		
	}
}
