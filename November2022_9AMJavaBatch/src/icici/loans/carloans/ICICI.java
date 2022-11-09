package icici.loans.carloans;

public class ICICI implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in ICICI");
	}
	
	public static void main(String[] args)
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

}
