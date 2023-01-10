//Method call flow.
public class Demo1 {

	public static void main(String[] args) {
		System.out.println("from main()");
		test();
		System.out.println("End of main()");
		}
	public static void test()
	{
		System.out.println("from test()");
		m1();
	}
	public static void m1()
	{
		System.out.println("from m1()");
	}

}

