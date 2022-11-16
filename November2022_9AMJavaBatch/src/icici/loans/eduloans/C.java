package icici.loans.eduloans;

import javax.net.ssl.ExtendedSSLSession;

import icici.loans.carloans.A;
import icici.loans.carloans.B;

public class C extends B
{
	public void m1()
	{
		System.out.println("iam overriden m1 from C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C");
	}

	public static void main(String[] args) 
	{
		B b = new B();
		b.m2();
		b.m1();
		
		C c = new C();
		c.m3();
		c.m1();
		System.out.println(c.x);
	}

}
