package onlypratice;

import java.util.Iterator;

enum Day
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumExample
{
	public static void main(String[] args) {
		
		//Traditional Way To print values from Enum
		
		
		
		
		//Enum start with 0 and ordinal will give the index of particular value
		Day s=Day.FRIDAY;
		System.out.println(s.ordinal());
		
		System.out.println("<<<<<<<<<<>>>>>>>>");
		Day[] s1=Day.values();
		System.out.println(s1[1]);
		
		
		
		
		
		//to know the class of an object
		System.out.println(s1.getClass());
		
		
		
		for(Day s2:s1)
		{
			System.out.println(s2+"       :  "+s2.ordinal());
		}
		System.out.println("<<<<<<<<<<>>>>>>>>");
		
		
		
		
		
		
			Day[]days=Day.values();
	        for(int i=0;i<days.length;i++)
	        {
	        	System.out.println(days[i]);
	        }
	        
	        
	     //Iterating each Values from Days
//		  for(Day days:Day.values())
//		  {
//			  System.out.println(days);
//		  }		
		
		
		
		
		        Day today = Day.SATURDAY;
		        

		        switch (today) {
		            case MONDAY:
		                System.out.println("It's the start of the week!");
		                break;
		            case WEDNESDAY:
		                System.out.println("It's hump day!");
		                break;
		            case FRIDAY:
		                System.out.println("TGIF!");
		                break;
		            case SATURDAY:
		                System.out.println("LAST DAY OF WEEK ENJOY sUNDAy!");
		                break;
		            default:
		                System.out.println("It's just another day.");
		        }
		}

		
	}
