package mock;

public class ParentClass 
{
	int i=10;
	int j=20;
	void sum()
	{
		System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		ParentClass pr = new ParentClass();
		pr.sum();
	}
}
