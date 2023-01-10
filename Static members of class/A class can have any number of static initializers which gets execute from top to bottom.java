package staticinitializers;
//A class can have any number of static initializers which gets execute from top to bottom
public class StaticInit1 {
	static int k=10;
	static int i;
	static {
		System.out.println(k);
		k=30;
		i=50;
	      }
	static int c;
	static 
	{
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		System.out.println(k);
		System.out.println(i);
		System.out.println(c);
	}

}
