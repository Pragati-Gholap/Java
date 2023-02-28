//WAJP to find product of array element.
public class Array9 {

	public static void main(String[] args) {
	 int[] a= {10,20,30,40,50};
	 int mul=1;
	 for(int i=0;i<=a.length-1;i++)
	 {
		 mul=mul*a[i];
	 }
	 System.out.println("product of array element="+mul);

	}

}
