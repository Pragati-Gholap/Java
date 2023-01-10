package nonstatic;
//WAJP to get StudentDetails.
public class StudentDetails {
	String name;
	int id;
	long cno;
    static String school_name="Abc Highschool";
	public void getAttribute()
	{
		System.out.println("Student Name="+name);
		System.out.println("Student Id="+id);
		System.out.println("Student contact Number="+cno);
		System.out.println("Student School Name="+school_name);
	}
	public void initialize(String sname,int sid, long scno)
	{
		name=sname;
		id=sid;
		cno=scno;
	}

	public static void main(String[] args)
	{
		StudentDetails s1=new StudentDetails();
		s1.initialize("pragati", 123,123786578);
		StudentDetails s2=new StudentDetails();
		s2.initialize("puja", 125,1078567856);
		StudentDetails s3=new StudentDetails();
		s3.initialize("manisha",150,1678099919);
		s1.getAttribute();
		s2.getAttribute();
		s3.getAttribute();
		
		}
 
}
