import java.util.Scanner;
//Using reference variable call the respective method of scanner class to store the data
public class Dynamic {

	public static void main(String[] args)
	{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter byte value");
     byte b=s.nextByte();
     System.out.println("Enter short value");
     short sh=s.nextShort();
     System.out.println("Enter int value");
     int i=s.nextInt();
     System.out.println("Enter float value");
     float f=s.nextFloat();
     System.out.println("Enter double value");
     double d=s.nextDouble();
     System.out.println("Enter a word");
     String s1=s.next();
     System.out.println("Enter a char");
     char ch=s.next().charAt(0);
     System.out.println(b);
     System.out.println(sh);
     System.out.println(i);
     System.out.println(f);
     System.out.println(d);
     System.out.println(s1);
     System.out.println(ch);
     
    }

}
