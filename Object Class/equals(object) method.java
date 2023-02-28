//equals(object) method
public class Book {
	String sname;
	Book(String name)
	{
		this.sname=name;
	}
//The return type of equals method is boolean.
//equals method implemented such a way that it will
//compares reference instead of comparing states

	public static void main(String[] args) {
		Book b1=new Book("java");
		Book b2=b1;
		System.out.println(b1.sname);//java
		System.out.println(b2.sname);//java
		System.out.println(b1==b2);//true
		System.out.println(b1.equals(b2));//true
		
		Book b3=new Book("java");
		Book b4=new Book("java");
		System.out.println(b1.sname);//java
		System.out.println(b2.sname);//java
		System.out.println(b3==b4);//false
		System.out.println(b3.equals(b4));//false
		

	}

	}
