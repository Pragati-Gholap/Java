package nonstatic;
//Without creating object we cannot access non-static variable.
public class NonStatic 
   {
	int a;//Non-static variable

	public static void main(String[] args)
	{
		NonStatic ns= new NonStatic();
		System.out.println(ns.a);//0
		
	}

 }
