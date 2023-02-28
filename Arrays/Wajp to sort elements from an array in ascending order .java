//Wajp to sort elements from an array in ascending order 
public class Array11 {

	public static void main(String[] args) {
		int[] a= {10,12,7,8,5,4,13};
		for(int i=0;i<=a.length-1;i++)
		{
		 for(int j=i+1;j<=a.length-1;j++)
		 {
			 int temp;
			 if(a[i]>a[j])
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
		}
		System.out.println("after sorting");
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.println(a[k]);
		}

	}

}
