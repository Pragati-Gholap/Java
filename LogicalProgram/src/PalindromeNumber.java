
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=121;
		int temp=num;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println(num +" is palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}
		

	}

}
