package onlypratice;

import java.util.ArrayList;
import java.util.Collections;

public class Emp1 
{
public static void main(String[] args) {
	ArrayList<Emp>emp=new ArrayList();
	emp.add(new Emp(1,"Mahesh"));
	emp.add(new Emp(2,"Rajes"));
	emp.add(new Emp(0,"Mahesh"));
	Collections.sort(emp);
	System.out.println(emp);
}
}
