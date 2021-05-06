package first;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation 
{
	
	
	
	public static void main(String[] args) 
	{
		String Uname= "Yogesh";
		String pass ="Yogi@1996";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Login Page!!");
		System.out.println("Enter your User ID");
		 String c= sc.nextLine();
		boolean j=Pattern.matches("^[A-Za-z]\\w{4,29}$", (c));
		System.out.println("Enter your Password");
		String d= sc.next();
		boolean x=Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", (d));
		if(j&x==true)
		{
			if(c.equals(Uname) && (d.equals(pass)))
			{
				System.out.println("Loged on, Welcome to the Home Page");
			}
			else 
			{
				System.out.println("enter valid details");
			}
		}
		else 
		{
			System.out.println("Enter Valid UserID And Password Format");
		}
			
	}
}



