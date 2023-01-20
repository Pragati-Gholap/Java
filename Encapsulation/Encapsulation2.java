package encapsulation;
//Encapsulation2
class Account
{
	private String acc_hol_name;
	private long acc_no;
	private double balance;
	Account(String accname,long accno,double bal)
	{
		this.acc_hol_name=accname;
		this.acc_no=accno;
		this.balance=bal;
	}
	public String getName()
	{
		return acc_hol_name;
	}
	public void setName(String newname)
	{
		this.acc_hol_name=newname;
	}
	public long getAccount()
	{
		return acc_no;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double newbalance)
	{
		this.balance=this.balance+newbalance;
	}
	public void getAccountDetails()
	{
		System.out.println("Account holder name="+acc_hol_name);
		System.out.println("Account number="+acc_no);
		System.out.println("Account balance="+balance);
	}
	
}

   public class AccountDriver {

	public static void main(String[] args) {
		Account ac1=new Account("pragati",3456,180008);
		ac1.getAccountDetails();
		System.out.println(ac1.getName());
		ac1.setName("puja");
		ac1.getAccountDetails();
		System.out.println(ac1.getBalance());
		ac1.setBalance(1000);
		ac1.getAccountDetails();
		
	}

}
