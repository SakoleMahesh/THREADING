package onlypratice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Objects;

public class Compare  {
	
	
	public static void main(String[] args) {
		Employee e1=new Employee("Ram",1);
		
		Employee e2=new Employee("Sam",2);
		Employee e3=new Employee("Kam",3);
		Employee e4=new Employee("Bam",4);
		
		Employee e5=e2;

		System.out.println(e1.toString());
		
		

	
	System.out.println(e2.equals(e5));
	
 	


}
}
class Employee
{
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ",  id=" + id + "]";
	}
	

}