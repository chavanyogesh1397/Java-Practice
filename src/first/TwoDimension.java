package first;

public class TwoDimension 
{
	public static void main(String[] args) 
	{
		int a[][]= {{100,200},{300,400},{500,600}};//0
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)//
			{
				System.out.println(a[i][j]);
			}
		}*/
		for(int r[]:a)
		{
			for(int s:r)
			{
				System.out.println(s);
			}
			
		}
	}
}
