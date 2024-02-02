package arithmatic_logics;

public class Demoo extends Abstract1 implements Interface {
		
	private  Demoo()
	{
		super();
		System.out.println("Demo");
	}
	public static void main(String[] args) 
	{
//		Demoo obj=new Demoo(5) ;
		Abstract1 ob=new Demoo() ;
		
		
		Interface.Run();
				
	}


	
}
