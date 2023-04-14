
public class Pattern14 {

	public static void main(String[] args) {
		 int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				if(k==1 || i==4 || k==2*i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(num++);
				}
			}
			System.out.println();
		}
		

	}

}
