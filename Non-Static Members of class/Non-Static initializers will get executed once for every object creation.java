package nonstatic;
//Non-Static initializers will get executed once for every object creation
public class NonStatic3 
{
	int k;
	{
		k=10;
	}
	int j=25;
	{
		System.out.println(k);
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println("from main()");
		NonStatic3  ns1=new NonStatic3();
		System.out.println(ns1.k);
		System.out.println(ns1.j);
		NonStatic3 ns2=new NonStatic3();
		System.out.println(ns2.k);
		System.out.println(ns2.j);
		}
	{
		k=5;
		j=7;
	}

}
