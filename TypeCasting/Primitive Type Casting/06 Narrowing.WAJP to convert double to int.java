//06 Narrowing.WAJP to convert double to int
public class Narrowing1 {

	public static void main(String[] args) {
		double d=24.56;
		int a=(int)d; //narrowing
		System.out.println(d); //24.56
		System.out.println(a);//24 //in this program there is data loss
	

	}

}
