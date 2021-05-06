package casting;

public class MainClass 
{
public static void main(String[] args) 
	{
	UpCasting x = new ChildClass();
	//x.car();
	//x.amount();
	UpCasting y = new UpCasting();
	//y.amount();
	//y.car();
	ChildClass z = new ChildClass();
	z.amount();
	z.car();
	}
}
