package first;

public class Constructor2 
{
	int a; //Initialization
	int b;
	int c;
	Constructor2() //User Defined Constructor with zero Parameter
	{
		a=20; // Declaration
		b=30;
		System.out.println(a+b);
	}
	Constructor2(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("Sum of two no is "+c);
	}
	Constructor2(int a,int b,int c)
	{
		c=a+b+c;
		System.out.println(c);
		System.out.println("Three Paramater");
	}
	public static void main(String[] args) 
	{
		Constructor2 x = new Constructor2(10,10);
		
	}
}
