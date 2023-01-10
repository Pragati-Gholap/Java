package nonstatic;
//Non-Static variable accessing outside the class.
public class A2 
{

	public static void main(String[] args)
	{
		NonStatic n=new NonStatic();
		System.out.println(n.a);//0(accessing outside the class) 
		

	}

}
