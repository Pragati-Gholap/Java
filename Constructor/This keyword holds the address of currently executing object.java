package Constructor;
//This keyword holds the address of currently executing object
public class StudentDetails1 
  {
	String name;
	int id;
	long cno;
	static String schname="Abc Highschool";
	{
		System.out.println("from multi-line nonstatic initializers");
	}
	StudentDetails1(String sname,int sid,long scno)
	{
		this.name=sname;
		this.id=sid;
		this.cno=scno;
	}
	public void getAttribute()
	{
		System.out.println("student name="+name);
		System.out.println("student id="+id);
		System.out.println("student contact number="+cno);
		System.out.println("student school name="+schname);
	}
	
	public static void main(String[] args) 
	{
		StudentDetails1 st1=new StudentDetails1("pragati",123,1345678976);
		st1.getAttribute();
		StudentDetails1 st2=new StudentDetails1("manisha",124,1567890368);
		st2.getAttribute();
		
	}

}

