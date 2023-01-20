package inheritance;
//multilevel inheritance
class A
{
	int a=10;
}
class B extends A
{
	int b=20;
}
class C extends B
{
	int c=30;
}
class D extends C
{
	int d=40;
}
public class Driver3 {

	public static void main(String[] args) {
		D d1=new D();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
		
	}

}

