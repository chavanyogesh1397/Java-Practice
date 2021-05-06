package first;

public class Star 
{
	public static void main(String[] args) 
	
	{
		int count=0;
		String t="*";
		for(int i=0;i<=10;i++)
		{
			if(count==0)
			{
				System.out.println("*");
			}
	
			for(int j=0;j<i-1;j++)
			{
				count++;
				
			}
			
		}
	
	}
}
