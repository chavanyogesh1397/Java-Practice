package mock;

public class ChildClass extends OverrideEx
{
	public static void m1()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,40};
		System.out.println(ar.length);
		m1();
		OverrideEx.m1();
	}
}
