//calculate sum and average of array.
public class Array8 {

	public static void main(String[] args) {
	 int[] a= {10,20,30,40,50};
	 int sum=0;
	 int avg=0;
	 for(int i=0;i<=a.length-1;i++)
	 {
		 sum=sum+a[i];
	 }
	 System.out.println("sum:"+sum);
	 avg=sum/a.length;
	 System.out.println("avg:"+avg);

	}

}
