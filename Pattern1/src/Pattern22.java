
public class Pattern22 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=2*4-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
