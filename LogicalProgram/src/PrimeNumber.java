
public class PrimeNumber {

	public static void main(String[] args) {
	 
	  for(int j=2;j<=100;j++)
	  {
		  
		 int factor=0;
	  
		 for(int i=1;i<=j;i++)
	   {
		  if(j%i==0)
		  {
			 factor++;
		  }
	   }
	  
	  if(factor<=2)
	  {
		  System.out.println(j);
	  }
	  
	  }
	}
}
