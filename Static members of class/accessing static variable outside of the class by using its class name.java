package staticvariable;
//accessing static variable outside of the class by using its class name
public class B {

	public static void main(String[] args)
	{
	System.out.println("from class B");
	System.out.println(A.k);//accessing static variable outside of the class by using its class name. 
	A a1=new A();
	System.out.println(a1.k);//with object reference
	

	}

}



