package Static;
// 01 Static Method
public class Demo {
	public static void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) {
		test();//Directly by using method name
		Demo.test();//accessing with the help of class name within the same class
		Demo d1=new Demo();
		d1.test();//accessing the static method using object reference
		
		

	}

}
