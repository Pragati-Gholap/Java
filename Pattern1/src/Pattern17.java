
public class Pattern17 {

	public static void main(String[] args) {
		int num=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2==1)
				{
					System.out.print(num++);
				}
				else
				{
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
		

	}

}
