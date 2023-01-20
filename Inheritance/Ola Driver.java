package Inheritance;
class ola
{
	String starting;
	String destination;
	ola(String start,String end)
	{
		this.starting=start;
		this.destination=end;
	}
}
class Bike extends ola
{
	double price=5;
	Bike(String start,String end)
	{
		super(start,end);
	}
	public void getbikeAttribute()
	{
		System.out.println("starting point"+this.starting);
		System.out.println("destination point"+this.destination);
		System.out.println("cost per km"+this.price);
		
	}
}
class Auto extends ola
{
	double price=10;
	Auto(String start,String End)
	{
		super(start,End);
	}
	public void getautoAttribute()
	{
		System.out.println("starting point"+this.starting);
		System.out.println("destination point"+this.destination);
		System.out.println("cost per km"+this.price);
		
	}
	
}

public class OlaDriver {

	public static void main(String[] args) {
		Auto a1=new Auto("wakad","deccan");
		a1.getautoAttribute();
		Bike b1=new Bike("wakad","deccan");
		b1.getbikeAttribute();

	}

}
