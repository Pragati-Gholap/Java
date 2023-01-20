package inheritance;
//super call statement is used to call the constructor of parent class.
class Animal
{
	int k=10;
	Animal()
	{
		super();
		System.out.println("from parent class");
	}
}
class Dog extends Animal
{
	int a=15;
	Dog()
	{
		super();
		System.out.println("from child class");
	}
}

public class Driver4 {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.a);
		System.out.println(d.k);

	}

}

