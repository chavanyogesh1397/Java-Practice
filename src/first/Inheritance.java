package first;

public interface Inheritance 
{
	
int a=10;
int b=40;



}

	class C implements Inheritance
{

	public void sum()
	{
		System.out.println(a+b);
	}
public static void main(String[] args) 
	{
		C rs = new C();
		rs.sum();
	}
}

