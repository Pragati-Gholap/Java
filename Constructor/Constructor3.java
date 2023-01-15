package Constructor;

public class Constrcutor3 
   {
	static int a=7;
	int b;
	Constrcutor3(int var1,int var2)
	{
		b=var1;
		d=var2;
	}
	static
	{
		System.out.println(a);
		c=12;
	}
	static int c;
	int d;
	{
		System.out.println(b);
		System.out.println(d);
	}
	
   public static void main(String[] args) 
   {
	   System.out.println("from main()");
	   System.out.println(a);
	   System.out.println(c);
	   
	   Constrcutor3 d1=new Constrcutor3(30,40);
	   System.out.println(d1.b);
	   System.out.println(d1.d);
	   
	   Constrcutor3 d2=new Constrcutor3(-4,8);
	   System.out.println(d2.b);
	   System.out.println(d2.d);
	   
		

	}

}
