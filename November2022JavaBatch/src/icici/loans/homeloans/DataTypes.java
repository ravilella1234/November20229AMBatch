package icici.loans.homeloans;

public class DataTypes 
{
	byte b; // 1 byte
	short s; // 2 bytes
	int i; // 4 bytes
	long l; // 8 bytes
	
	float f; // 4 bytes
	double d; // 8 bytes
	
	char ch; // 2 bytes
	boolean bb; 
	
	String str;
	
	static String cname;
	static float roi;

	public static void main(String[] args) 
	{
		int x = 10;
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte : " +  obj.b);
		System.out.println("Short : " +  obj.s);
		System.out.println("Int : " +  obj.i);
		System.out.println("Long : " +  obj.l);
		
		System.out.println("Float : " +  obj.f);
		System.out.println("Double : " +  obj.d);
		
		System.out.println("Char : " +  obj.ch);
		System.out.println("Boolean : " +  obj.bb);
		
		System.out.println("String : " +  obj.str);
		
		System.out.println("cname : "+ cname);
		System.out.println("ROI :"+roi);
		
		System.out.println("X : " + x);
	}

}
