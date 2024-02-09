package jdbcc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCall
{
	public static void main(String[] args) throws SQLException 
	{
		JdbcConnection J=new JdbcConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("******Enter The choice******");
		System.out.print("1: get All Student FromDatabase\n2: get From List\n3: Delete Student by id\n4: Enter Student Id to get All Info\n5: Enter Student Id to Update");
		
		int i=sc.nextInt();
		switch(i)
		{
		case 1 :System.out.println("Geting all Student");
				J.getAllStudentssfromDatabase();
				break;
		
		
		case 2:System.out.println("Geting all Student");
				List <Student>l=J.GetallStudent();
				System.out.println(l);
				break;
				
				
			
		case 3:System.out.println("Enter  student id to Dlete Id");
		       int id=sc.nextInt();
		       System.out.println("Deleting student by Id");
		       boolean B=J.DeleteStudent(id);
				if (B) {
					System.out.println("Record Deleted");
				}
				else
				{
					System.out.println("Record Not Found");
				}
					break;
					
		case 4:System.out.println("Enter  student id to get all Details");
		       id=sc.nextInt();	
		       Student std=J.GetInformation(id);
		       if(std!=null)
		       {
		    	   System.out.println(std);   	   
		       }
		       else {
		    	   
		    	   System.out.println("No Record Found");   	   
		       }
				break;
				
		case 5:System.out.println("Enter  student id to get Update Id");
			       id=sc.nextInt();		
		}
		
		
		
		
		
		
		
	
	
	}

}
