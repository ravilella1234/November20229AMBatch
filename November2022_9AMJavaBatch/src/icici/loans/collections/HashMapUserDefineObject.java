package icici.loans.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefineObject 
{

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1, "e1");
		Emp e2 = new Emp(2, "e2");
		Emp e3 = new Emp(3, "e3");
		Emp e4 = new Emp(4, "e4");
		
		/*e1.dispaly();
		e2.dispaly();
		e3.dispaly();
		e4.dispaly();*/
		
		
		HashMap<Integer, Emp> h = new HashMap<Integer, Emp>();
		h.put(e1.eno, e1);
		h.put(e2.eno, e2);
		h.put(e3.eno, e3);
		h.put(e4.eno, e4);
		
		Set<Entry<Integer, Emp>> entries = h.entrySet();
		for(Entry<Integer, Emp> e:entries)
		{
			System.out.println(e.getKey());
			Emp ee = e.getValue();
			ee.dispaly();
		}
	}

}
