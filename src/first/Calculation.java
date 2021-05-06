package first;

public class Calculation 

{
	int i;
	int j;
	int k;
	
	Calculation(int a,int b, int c)
	{
		i =a;
		j= b;
		k= c;
	}
	void sum()
	{
		System.out.println(i+j+k);
	}
	public static void main(String[] args) 
	{
		Calculation cal= new Calculation(5, 5, 5);
		cal.sum();
	}
}
