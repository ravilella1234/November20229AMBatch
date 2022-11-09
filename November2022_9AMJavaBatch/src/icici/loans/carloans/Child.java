package icici.loans.carloans;

public class Child extends FirstAbstract
{

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m2() {
		System.out.println("iam overriden m2 in Child");
	}

}
