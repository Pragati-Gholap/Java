package Constructor;

public class Constrcutor2 {
	static int a;
	{
		System.out.println(a);
		a=14;
		d=45;
	}
	int b=20;
	static int c;
	int d;
	static
	{
		System.out.println(a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(c);
		Constrcutor2 c1=new Constrcutor2();
		System.out.println(c1.b);
		System.out.println(c1.d);
		

	}

}


