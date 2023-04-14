
public class Pattern15 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(k==1 || i==5 || k==2*i-1)
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
