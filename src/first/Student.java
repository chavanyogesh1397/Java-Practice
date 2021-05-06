package first;

public class Student 
{
	int SID;
	String Sname;
	int Sub1,Sub2,Sub3;
	int totalMark;
	
	void getStuData(int STID,String SFname)
	{
		SID = STID;
		Sname = SFname;		
	}
	void getStuMarks(int Subject1,int Subject2,int Subject3)
	{
		Sub1 = Subject1;
		Sub2 = Subject2;
		Sub3 = Subject3;
		
	}
	void totalMarks()
	{
		System.out.println(SID+Sname);
		System.out.println("Total Marks=" + (Sub1+Sub2+Sub3));
		
	}
	
	public static void main(String[] args) 
	{
		Student std=new Student();
		{
			std.getStuData(1, "Akash");
		}
		Student std1=new Student();
		{
			std.getStuMarks(50, 50, 50);
		}
		Student std2= new Student();
		{
			std.totalMarks();
		}

		
	}
	
	
	
	

}
