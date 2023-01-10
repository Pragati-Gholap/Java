//Parameterized Method
public class Demo3 {

	public static void main(String[] args) {
		add(10,20);
		add(40,50);
		add('a','b');//type promotion is possible
		//add(2.45,5.78); //CTE
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	

	}


