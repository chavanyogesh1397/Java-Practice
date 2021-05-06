package first;

 interface InterfaceA 
{

	int a =20;
	int b=20;
	void add();

}

 interface B  
{
	int x= 20;
	int y= 30;
	void mul();
}
 
 class Result implements InterfaceA,B
 {
	public void add()
	 {
		 System.out.println(a+b);
	 }
	public void mul()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args)  
	{

		Result cal =new Result();
		 cal.add();
		 cal.mul();
		 
	}
 }