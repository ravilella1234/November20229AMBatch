package icici.loans.eduloans;


class Parent
{
	public void workHard()
	{
		System.out.println("Parent : wakeup early, goto college....");
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}


public class ChildClass extends Parent
{

	public void workHard()
	{
		System.out.println("Child : wakeup anytime, goto movies....");
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}
	
	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.workHard();
		obj.care();
		obj.love();
		
		Parent c = new ChildClass();
		c.workHard();
		c.care();
	}

}
