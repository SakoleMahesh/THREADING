package onlypratice;

public class Overload 
{
	public Overload() {
		System.out.println("Inside Constructor");
	}
	public void M1(Integer a,Float b)
	{
		System.out.println("Inside m1");
	}
	
	
	public void M1(Integer a,Integer b)
	{
		System.out.println("Inside m1");
	}
	
	
	public void M(int a,float b)
	{
		System.out.println("Inside m1");
	}
	
	public void M1(long a,int b)
	{
		System.out.println("Inside m2");
	}
public static void main(String[] args) {
	
			Overload overload = new Overload();
			overload.M1(20, 20f);
	
}
}
