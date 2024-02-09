package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnection 
{
	private static Connection con=null;
	private static String Url="jdbc:mysql://localhost:3306/student";
	private static String User="root";
	private static String Password="root";
	
	
	
	public void getAllStudentssfromDatabase() throws SQLException
	{
		if (con == null) {
			try {
				con=DriverManager.getConnection(Url,User,Password);
				Statement St=con.createStatement();
				System.out.println("hi");
				ResultSet rs=St.executeQuery("select * from student");
				while(rs.next())
				{
					System.out.println("id :"+rs.getInt("id")+  "  Name :"+rs.getString("name")+  "  Subject :"+rs.getString("subject")+  "  Roll Number :"+rs.getString("rollno"));
				}
			}
			finally {
				con.close();
			}
		}
	}
		
		

		
		
		public List<Student> GetallStudent() throws SQLException {
			
				List<Student> L=new ArrayList<Student>();

					con=DriverManager.getConnection(Url,User,Password);
					Statement St=con.createStatement();
					ResultSet rs=St.executeQuery("select * from student");
					while(rs.next())
					{

						while (rs.next()) {
							Student student = new Student();
							student.setId(rs.getInt(1));
							student.setName(rs.getString(2));
							student.setSubject(rs.getString(3));
							student.setRollno(rs.getString(4));
							L.add(student);
						}
					}
					con.close();
			return L;
		}


		public boolean DeleteStudent(int id) throws SQLException
		{
			boolean flag=false;
			con=DriverManager.getConnection(Url,User,Password);
			Statement St=con.createStatement();
			ResultSet rs=St.executeQuery("select * from Student");
			while(rs.next()) {
				if(id==rs.getInt(1))			
				flag=true;
			}
			St.execute("Delete from student where id="+id);
			
				return flag;
			
			
		}





		public Student GetInformation(int id) throws SQLException
		{
			
			
			con=DriverManager.getConnection(Url,User,Password);
			Statement St=con.createStatement();
			ResultSet rs=St.executeQuery("select * from student where id="+id);
			while(rs.next())
			{
					if(id==rs.getInt(1)) 
					{
						Student std=new Student();
						std.setId(rs.getInt(1));
						std.setName(rs.getString(2));
						std.setSubject(rs.getString(3));
						std.setRollno(rs.getString(4));
						return std;	
					}

					}
			return null;
			
		}
	}