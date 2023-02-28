//overriding equals method
public class Book1 {
	String name;
	int id;
	Book1(String sname,int sid )
	{
		this.name=sname;
		this.id=sid;
	//we override equals method to compare states of
	//of an object instead of comparing reference of
	//an object.
	}
	public boolean equals(Object o)
	{
		Book1 b=(Book1)o;
		return this.id==b.id;//comparing based on id
	}

	public static void main(String[] args) {
		Book1 b1=new Book1("java", 121);
		Book1 b2=new Book1("java",320);
		System.out.println(b1.name);//java
		System.out.println(b2.name);//java
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//false
	

	}

}

