//hashcode method
public class Book2 {
	String name;
	int id;
	public Book2(String sname,int sid) {
		this.name=sname;
		this.id=sid;
	}
//The return type of hashCode method is int.
//it is implemented such a way that it returns a unique
//integer value based on the reference of an object
	public static void main(String[] args) {
		Book2 b1=new Book2("java", 120);
		Book2 b2=new Book2("java",120);
		System.out.println(b1.hashCode());//366712642
		System.out.println(b2.hashCode());//1829164700

	}

}
