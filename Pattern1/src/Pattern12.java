
public class Pattern12 {

	public static void main(String[] args) {
          int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1 || i==5 || j==5)
				{
					System.out.print("*");
				}
				else
					System.out.print(a++);
			}
			System.out.println();
		}
			

	}

}
