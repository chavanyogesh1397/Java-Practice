package casting;

public class ExplicitImplicit 
{

	
	
	public static void main(String[] args) 
	{
		ExplicitImplicit cx = new ExplicitImplicit();
		
		
		//Casting int to char
		
		int a =68;
		char b= (char)a;
		System.out.println(b);
		
		//Casting char to int
		
		char d='r';
		int e=(int)d;
		System.out.println(e);
		
		//Casting String to int
		
		String s1="100";
		int ty=Integer.parseInt(s1);
		System.out.println(ty);
		System.out.println(s1+100);
		System.out.println(ty+100);
		
		//Casting int to String
		
		int y=10;
		String ft=String.valueOf(y);
		System.out.println(y+100);
		System.out.println(ft+100);
		
		//Casting String to Long
		
		String yu= "7896541232";
		long re =Long.parseLong(yu);
		System.out.println(yu+100);
		System.out.println(re+100);
		
		//Casting Long to String
		
		long kj= 126547989;
		String er=String.valueOf(kj);
		System.out.println(kj+100);
		System.out.println(er+100);
		
		
	}
}
