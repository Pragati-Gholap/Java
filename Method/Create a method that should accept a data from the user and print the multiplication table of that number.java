import java.util.Scanner;

//Create a method that should accept a data from the user and print the multiplication table of that number
public class Demo8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		mul(num);
	}
	public static void mul(int a)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(a+"*"+i+"="+(a*i));
	}
	}

	

}
