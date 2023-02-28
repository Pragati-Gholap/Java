//Wajp to print prime number of an array.
public class Array5 {

	public static void main(String[] args){
		int[]a= {4,8,6,10,2,3,5,7};
		for(int i=0;i<=a.length-1;i++)
		{
			int factor=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					factor++;
				}
			}
			if(factor<=2)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	
	}
