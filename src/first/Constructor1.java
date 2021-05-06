package first;

public class Constructor1 
{
	int a;
	int b;
	static void Constructor1(int a,int b)
	{
		
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		Constructor1 c = new Constructor1();
		c.Constructor1(30, 40);
	}
}
