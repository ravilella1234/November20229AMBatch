package icici.loans.carloans;

public class SecondClass 
{
	
	// DataProperties
	int a=10,b=20,result;
	
	// Behaviours 
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " +  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : "+ result);
	}
	
		
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hello");	
				
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
		
	}
}
