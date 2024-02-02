package onlypratice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		HashMap<String, Integer>Mp=new HashMap<String, Integer>();
		Mp.put("AAA",1);
		Mp.put("BBB",2);
		Mp.put("CCC",5);
		Mp.put("DDD",4);
		
		System.out.println(Mp);
		System.out.println(Mp.containsKey("AAA"));
		System.out.println(Mp.containsValue(1));
		System.out.println(Mp.keySet());
		System.out.println(Mp.values());
		
		@SuppressWarnings("unchecked")
		HashMap<String,Integer>clone=(HashMap<String, Integer>) Mp.clone();
		System.out.println(clone);
	
			
		
}
}