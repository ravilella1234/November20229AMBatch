package icici.loans.carloans;

public abstract class FirstAbstract 
{
	int a = 100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete in FirstAbstract");
	}
	
	public abstract void m2();

	public static void main(String[] args) 
	{
		//FirstAbstract obj = new FirstAbstract();
	}

}
