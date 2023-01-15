package Constructor;
//Constructor chaining
public class StudentDetails2 
  {
	String name;
	int id;
	long cno;
	static String schname="Abc Highschool";
	public StudentDetails2(String name)
	{
		this.name=name;
		System.out.println("from studentdetails(string)");
	}
	StudentDetails2(String name,int id)
	{
		this(name);
		this.id=id;
		System.out.println("from studentdetails(string,int)");
	}
	public StudentDetails2(String name,int id,long cno)
	{
		this(name,id);
		this.cno=cno;
		System.out.println("from student details(string,int,long)");
	}
	public void getAttribute()
	{
		System.out.println("stdeunt name="+name);
		System.out.println("student id="+id);
		System.out.println("stdudent cno="+cno);
		System.out.println("stdeunt name="+schname);
	}
	
	public static void main(String[] args) {
		StudentDetails2 st1=new StudentDetails2("pragati",100,1234567898);
		st1.getAttribute();
		
		

	}

}