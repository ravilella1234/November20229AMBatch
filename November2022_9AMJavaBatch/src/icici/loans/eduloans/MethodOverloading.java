package icici.loans.eduloans;

public class MethodOverloading 
{
	//A class cannot contain 2 same methods with same signatures, otherwise it’s a CE.
	
	/*public void m1(int x)
	{
		System.out.println(x);
	}*/
	
	public void m1(Integer x)
	{
		System.out.println(x);
	}
	
	public void m1(float x)
	{
		System.out.println(x);
	}
	
	public void m1(String x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravi");
	}

}
