//Remove duplicate value in array.
public class Array6 {

	public static void main(String[] args) {
	 int[]a= {10,10,9,8,7,6,5,9,7,8};
	 for(int i=0;i<=a.length-1;i++)
	 {
		 for(int j=i+1;j<=a.length-1;j++)
		 {
			 if(a[i]==a[j])
			 {
				 a[j]=0;
			 }
				 
		 }
	 }
	 System.out.println("After removing duplicate values");
	 for(int k=0;k<=a.length-1;k++)
	 {
		 if(a[k]!=0)
		 {
			 System.out.println(a[k]);
		 }
	 }

	}

}
