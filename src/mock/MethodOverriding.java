package mock;

public class MethodOverriding 
{
	void color(String Black,String White)
	{
		System.out.println("2 parameters");
	}
	void color(String Black)
	{
		System.out.println("With 1 parameter");
	}
	static void color(int a,String b)
	{
		System.out.println("No parameter");
	}
	public static void main(String[] args) 
	{
		MethodOverriding m = new MethodOverriding();
		m.color("Cat", "Dog");
		m.color("232");
		m.color(10, "shree");
	}
}
