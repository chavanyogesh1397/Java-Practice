package first;

import java.util.Scanner;

public class NextAlphabet 
{
	public static void main(String[] args) 
	{
		String a="Yogesh";
		for(int i=0;i<=a.length();i++)
		{
		int t= a.charAt(i);
		t++;
		char r = (char)t;
		System.out.println(r);
		}
	}	
}
