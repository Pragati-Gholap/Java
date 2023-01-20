package inheritance;
//Inheritance1
class parent
{
	int a=10;
}
class child extends parent
{
	int b=20;
}

public class Driver1 {

	public static void main(String[] args) {
		child ch=new child();
		System.out.println(ch.a);//10
		System.out.println(ch.b);//20
		parent b=new parent();
		System.out.println(b.a);//10;
		//System.out.println(b.b);//CTE(Using parent class reference variable
		                              //we cannot access child class members)
	

	}

}
