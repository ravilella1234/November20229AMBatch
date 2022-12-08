package icici.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100,100);
		h.put(2000,200);
		h.put(3,300);
		h.put(10,400);
		h.put(4,500);
		
		System.out.println(h);
		System.out.println(h.get(20));
		Set<Integer> keys = h.keySet();
		for(Integer key:keys)
		{
			System.out.println(key +"----"+h.get(key));
		}
		
	}

}
