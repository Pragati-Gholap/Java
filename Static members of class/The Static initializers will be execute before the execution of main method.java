package staticinitializers;
// The Static initializers will be execute before the execution of main method
public class StaticInit {
	static int a; //declaration
	static int b=60;//single line initializers
	static {
		System.out.println("from multi-line static initializers");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main()");
		System.out.println(a);
		System.out.println(b);
		System.out.println("end of main()");
	 

	}

}
