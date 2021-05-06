package first;

public class Throws 
{
public static void main(String[] args) throws InterruptedException 
{
	System.out.println("Hii");
	System.out.println("How are you??");
	try 
	{
	Thread.sleep(5000);
	}
	catch(InterruptedException e)
	{
		System.out.println();
	}
	finally
	{
		System.out.println("Exception Handled");
	}
	System.out.println("I am Fine");
}
}
