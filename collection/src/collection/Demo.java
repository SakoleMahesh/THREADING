package collection;
import java.util.*;

public class Demo{

	public static void main(String [] args) 
	{
		TreeSet ab =new TreeSet();
		{
		ab.add("aaa");
		ab.add("derd");
		ab.add("bfsb");
		ab.add("ccc");
		ab.removeFirst();
//		ab.add(2);
//		ab.add(5);
//		ab.add(0);
//		ab.add(3);
//		ab.add(0);
//		ab.add(0);
		System.out.println("Hello");
		System.out.println(ab);
		ab.removeFirst();
		
		System.out.println(ab);
		}
	}
}
