package nonstatic;
//We can access non-static method only by using object reference
public class NonStatic1 
  {

	public static void main(String[] args) 
	{
		NonStatic1 ns=new NonStatic1();
		ns.test();
	}
	public void test()
	{
		System.out.println("from non-static method of test()");
	}
	
	

	}


