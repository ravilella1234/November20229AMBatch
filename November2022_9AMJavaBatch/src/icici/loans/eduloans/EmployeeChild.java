package icici.loans.eduloans;

public class EmployeeChild extends Employee
{
	String city;

	public EmployeeChild(String city) 
	{
		//super();
		super(100,"sai",12.34f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	
	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
