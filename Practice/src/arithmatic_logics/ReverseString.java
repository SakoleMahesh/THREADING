package arithmatic_logics;

public class ReverseString {

	public static void main(String[] args) {
		String str="RAW",rtr ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rtr+=str.charAt(i);
			
		}
		System.out.println(rtr);
	}

}
