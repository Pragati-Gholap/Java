package Constructor;
//Constructor load all the non-static members of a class into the object created.
public class StudentDetails 
  {
	String name;
	int id;
	long cno;
	static String schname="Abc Highschool";
	{
		System.out.println("from multi-line nonstatic initializers");
	}
	StudentDetails(String sname,int sid,long scno)
	{
		name=sname;
		id=sid;
		cno=scno;
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
		StudentDetails st1=new StudentDetails("pragati",123,1345678976);
		st1.getAttribute();
		StudentDetails st2=new StudentDetails("manisha",124,1567890368);
		st2.getAttribute();
		
	}

}

