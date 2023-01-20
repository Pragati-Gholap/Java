package encapsulation;
//Encapsulation1
class B
{
	private int a=10;
	public int getter()
	{
		return a;
	}
	public void setter(int newdata)
	{
		a=newdata;
	}
}
public class A {

	public static void main(String[] args) 
	{
		B b1=new B();
		//System.out.println(b1.a); //CTE (direct access is restricted)
		System.out.println(b1.getter());//10
		b1.setter(20);
		System.out.println(b1.getter());//20
	}

}
