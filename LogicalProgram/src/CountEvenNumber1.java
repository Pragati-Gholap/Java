
public class CountEvenNumber1 {

	public static void main(String[] args) {
		
		int num=12345;
		int t1=num;
		int rem;
		while(t1!=0)
		{
			rem=t1%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			t1=t1/10;
		}
		

	}

}
