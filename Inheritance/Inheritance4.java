package inheritance;
class parent
{
	int a;
	{
		System.out.println("from MLNSI of parent class");
		System.out.println(a);
		a=12;
	}
}
class child extends parent
{
	int b;
	{
		System.out.println("from MLSNI of child class");
	}
}

public class Driver5 {

	public static void main(String[] args) {
		child ch1=new child();
		System.out.println(ch1.a);
		System.out.println(ch1.b);
	

	}

}
