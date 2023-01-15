package Constructor;
//constructor1
public class Constrcutor1 {
	int c;
	Constrcutor1(int e)
	{
		System.out.println("programmer written instrction from constructor1()");
		c=e;
	}
	{
		System.out.println("from multi-line nonstaticinit");
	}
	int d=34;
	
	public static void main(String[] args) {
		System.out.println("from main()");
		Constrcutor1 c1=new Constrcutor1(10);
		Constrcutor1 c2=new Constrcutor1(20);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c2.c);
		System.out.println(c2.d);
		
	}

}

