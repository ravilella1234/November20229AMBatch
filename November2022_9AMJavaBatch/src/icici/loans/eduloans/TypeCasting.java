package icici.loans.eduloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		//byte-1, short-2, int-4, long-8, float-4, double-8
		
		//1-ltr --->  500ML    ---> There is no risk  ---> Widening
		//1-ltr --->  1.5 ltr  ---> There is a risk(water overflow)  ---> Narrowing
		
		//Type casting from one primitive type to another primitive type
		double d1 = 12.34;
		System.out.println(d1);
		
		int d2 = (int) d1;
		System.out.println(d2);
		
		int x1 = 10;
		System.out.println(x1);
		
		double x2 = (double)x1;
		System.out.println(x2);
		
		
		//Type casting from one primitive type to corresponding wapper Class Type
		int i1 = 100;
		System.out.println(i1);
		
		//Integer i2 = i1;
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		//Type Casting from one wapper class Type to another Wapper Class Type
		String s1 = "200";
		String s2 = "300";
		
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);
		
	}

}
