package Inheritance;
//single level
class parent
{
	int a=10;
	static int b=20;
	public void p1()
	{
		System.out.println("from parent class");
	}
}
class child extends parent
{
	int c=30;
	static int d=40;
	public void p2()
	{
		System.out.println("from child class");
	}
}

public class Driver {

	public static void main(String[] args) {
		parent pa1=new parent();
		System.out.println(parent.b);
		System.out.println(pa1.a);
		System.out.println(pa1.b);
		pa1.p1();
		//System.out.println(pa1.c);
		//System.out.println(pa1.d);
		child ch1=new child();
		System.out.println(ch1.a);
		System.out.println(ch1.b);
		ch1.p1();
		System.out.println(ch1.c);
		System.out.println(ch1.d);
		ch1.p2();
		
	

	}

}
