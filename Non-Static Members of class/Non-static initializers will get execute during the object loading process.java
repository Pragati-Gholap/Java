package nonstatic;
//Non-static initializers will get execute during the object loading process.
public class NonStatic2 
    {
	int a=10;//single line non-static initializer
	{
		System.out.println("from multi-line non-static initializers1");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main()");
		NonStatic2 ns=new NonStatic2();
		System.out.println(ns.a);
	}
	{
		System.out.println("from multi-line non-static initializers12");
		System.out.println(a);
		a=12;
	}

}
