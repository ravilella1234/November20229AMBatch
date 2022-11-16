package icici.loans.eduloans;

public class Employee 
{
	int eno; 
	String ename;

	 public Employee()
	 {
		 System.out.println("iam default constructor...");
	 }
	
	public Employee(int i, String string) 
	{
		eno = i;
		ename = string;
	}

	public Employee(int i) 
	{
		eno = i;
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(1744,"ravi");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(1743);
	}
	
}
