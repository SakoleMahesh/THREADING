package arithmatic_logics;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int x,y,z = 0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number =");
		x=sc.nextInt();		
		System.out.println("Enter the First number =");
		y=sc.nextInt();		
		for(int i=1;i<=y;i++)
		{
			z=z+x;
		}
		System.out.println("Multiplication of the given number is ="+z);
		
	}

}
