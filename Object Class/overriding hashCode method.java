//overriding hashCode method
public class Book3 {
	String name;
	int id;
	public Book3(String sname,int sid) {
		this.name=sname;
		this.id=sid;
	}
//we can override hashCode method to return a unique
//integer value based on the states of an object.
	public int hashcode()
	{
		int a=name.hashCode();
		int b=id;
		return a+b;
		
	}

	public static void main(String[] args) {
		Book3 b1=new Book3("java",120);
		Book3 b2=new Book3("java", 120);
		System.out.println(b1.hashcode());//3254938
		System.out.println(b2.hashcode());//3254938
		

	}

}
