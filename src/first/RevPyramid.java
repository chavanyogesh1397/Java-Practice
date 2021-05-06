package first;

public class RevPyramid 
{
	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=1;i<=5;i++)//5
		{
			for(int j=5;j>=i;j--)//1 
			{
				System.out.print(" *"); //* * * * *
										//
			}
			
			System.out.println();
			
		}
	}
}
