package LinkedHashMapo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked
{
public static <T> void main(String[] args) {
	Map<String, Integer>Link=new LinkedHashMap<>();
	Link.put("AAA",123);
	Link.put("AAA",121);
	Link.put("AAb",124);
	Link.put("AAc",125);
	Link.put("AAd",126);
	Link.put(null,126);
	
	System.out.println(Link);
	
	
	
	System.out.println(Link.entrySet());
	System.out.println(Link.keySet());
	System.out.println(Link.values()); 
	
//	Set<String>hs=Link.keySet();
	
	Iterator<String>itr=Link.keySet().iterator();	
	while(itr.hasNext())
		System.out.println(itr.next());
	
	System.out.println(">>>>><<<<<<<");
	
	 Iterator<Integer> iterator = Link.values().iterator();
     while (iterator.hasNext()) {
         Integer value = iterator.next();
         System.out.println(value);
     }
	
	
}
}
