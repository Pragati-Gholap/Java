package staticinitializers;
//Static initializers are used to execute start up instruction
public class StaticInit {
	static int a; //declaration
	static int b=60;//single line initializers

	public static void main(String[] args) 
	{
		System.out.println("from main()");
		System.out.println(a);
		System.out.println(b);
		System.out.println("end of main()");
	 

	}

}



