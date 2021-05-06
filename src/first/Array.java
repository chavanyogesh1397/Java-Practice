package first;

public class Array 
{
public static void main(String[] args) 
	{
		/*int b=0;
		int i[] = {10,20,30,40,50};
	
		for(int a:i){
			b = b+a;
			System.out.println(b);
		}*/
		int d =0;
		int x = 30;
		int i[] = {20,30,40,20,60};
		for(int a:i)
		{	
		if(x==a)
			{
			System.out.println("no. is found");
			d++;
			}

			}
		if(d==0)
		{
			System.out.println("No is not Found");
		}
	}
}


