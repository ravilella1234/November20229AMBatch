package pack1;

public class Class2 extends Class1
{

	public Class2(int a, int b) 
	{
		super(a, b);
	}

	public static void main(String[] args) 
	{
		Class2 c2 = new Class2(1000, 2000);
		c2.add();
		c2.sub();
	}

}
