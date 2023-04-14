import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
	    int t1=no;
		int length=0;

		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		
		
		int t2=no;
		int arm=0;
		int rem;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
		for(int i=1;i<=length;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
		}
		 if(arm==no)
		 {
			 System.out.println(no+"it is the armstrong  number");
		 }
		 else
		 {
			 System.out.println(no+"it is not armstrong number");
		 }
		
    }
}


