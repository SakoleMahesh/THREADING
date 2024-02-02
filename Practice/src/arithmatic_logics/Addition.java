package arithmatic_logics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int x,y,z = 0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number =");
		x=sc.nextInt();		
		System.out.println("Enter the First number =");
		y=sc.nextInt();		
//		while(y!=0)
//		{
//			x++;
//			y--;
//		}
		
				z=-x-y;
				int a = Math.abs(z);	
				System.out.println("Addition of the given number is ="+a);
		
//		z=x-~y-1;
//		System.out.println("Addition of the given number is ="+z);
//		System.out.println(z);
		
		
	}

	}
