
public class CountEvenNumber {

	public static void main(String[] args) {
		int num=1234;
		int t1=num;
		int count=0;
		
		while(t1!=0)
		{
			int rem=t1%10;
			
			if(rem%2==0)
			{ 
				count++;
			}
		       t1=t1/10;
			
		}
		System.out.println(count);
		

	}

}
