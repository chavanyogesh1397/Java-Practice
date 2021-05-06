package first;

public class Exception 
{

public static void main(String[] args) 
{
	System.out.println("Program Started");
	int i=100;
	try 
		{
	System.out.println(i/0);
		}
	catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException Handled");
		}
	System.out.println("Program Under process");
	
	int a[]=null;
	try 
		{
			System.out.println(a.length);
		}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException Handled");
	}
	System.out.println("Program is still Under process");
	
	String s="abc";
	try
	{
		int j=Integer.parseInt(s);
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException handled");
	}
	System.out.println("Program closed");
}

}
