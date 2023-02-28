//WAJP to find smallest element of an array.
public class Array4 {

	public static void main(String[] args) {
		int[]a={15,80,40,34,12,17};
		int large=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
		

	}

}
