
public class CountTheNumber {

	public static void main(String[] args) {
		
		int no=1545;
		int t1=no;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
			
		}
		System.out.println(length);
		
	}

}
