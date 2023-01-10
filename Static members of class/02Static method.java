package Static;
//02Static method
public class Demo1 {

	public static void main(String[] args) {
		System.out.println("from Demo1 class");
		//test(); //CTE
		Demo.test();//accessing the test()of Demo class
		            //from outside of a class using with the help
		            //of class name.
		Demo d=new Demo();
		d.test();//we can accessing with the help of object reference
		         //also from outside of a class

	}

}
