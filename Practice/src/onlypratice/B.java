package onlypratice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public abstract class B implements Collection
{
	public static void main(String[] args) {
		

		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1,"mahesh"));
		al.add(new Student(5,"Vaibhav"));
		al.add(new Student(3,"Shrikant"));
		al.add(new Student(4,"Akash"));
		
		
		ArrayList<Integer>id=new ArrayList();
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(5);
		
		int index=id.indexOf(3);
		System.out.println(index);
		ArrayList<Student> bl=new ArrayList(al);
		
//		System.out.println(al);
//		Collections.sort(al,new NameComparator());
//		System.out.println(al);
//		
//		Collections.sort(bl,new NameComparator());	
//		System.out.println(bl);
		Collections.sort(bl,new IdComparator());	
		System.out.println(bl);
//		System.out.println(al);
		
//		Collections.reverse(al);
//		System.out.println(al);
		 
		
		
		
//		
//		Collections.shuffle(bl);
//		System.out.println(bl);
//		
		
	
	}
}

