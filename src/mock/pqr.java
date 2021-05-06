package mock;

public class pqr 
{


public static void main(String[] args) 
{
	String s1 ="Yogesh chavan";
	String t[] = s1.split(" ");
	System.out.println(t[0]);
	System.out.println(t[1]);
	String s2 ="Akash";
	char a[] =s2.toCharArray();
	System.out.println(a[0]);
	for(int i=0;i<=s2.length()-1;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println(s2.length());
	System.out.println(s2.toUpperCase());
	
}

}
