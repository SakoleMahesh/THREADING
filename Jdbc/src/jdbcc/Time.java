package jdbcc;

public class Time {

		private static final List<Student> List = null;

		public int createStudent(Student s) {
			Connection con = null;
			int res = 0;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prowings", "root", "root");
				Statement stmt = con.createStatement();
				int id = s.getId();
				String name = s.getName();
				String subject = s.getSubject();
				int roll = s.getRollNo();
				String insertQuery = "insert into student values(" + id + "," + "'" + name + "'" + "," + "'" + subject + "'"
						+ "," + roll + ")";
				res = stmt.executeUpdate(insertQuery);

				if (res > 0)
					System.out.println("Student record inserted successfully.. afftected rows are : " + res);
				else
					System.out.println("Record not inserted!!");

			} catch (SQLException e) {
				System.out.println("Some exception occurred while connecting to the DB!!");
				e.printStackTrace();
			} finally {
				try {
					con.close();
					System.out.println("Connection closed successfully!!!");
				} catch (SQLException e) {
					System.out.println("Error while closing the connection!!");
					e.printStackTrace();
				}
			}
			return res;

		}

		public Student getStudent(int id) {
			Connection con = null;
			Student std = null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prowings", "root", "root");
				Statement stmt = con.createStatement();

				ResultSet result = stmt.executeQuery("select * from student where id=+" + id);

				if (result.next()) {
					std = new Student();
					std.setId(result.getInt(1));
					std.setName(result.getString(2));
					std.setSubject(result.getString(3));
					std.setRollNo(result.getInt(4));
				} else {
					System.out.println("No student found with ID: " + id);
				}
			} catch (SQLException e) {
				System.out.println("Some exception occurred while connecting to the DB!!");
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
						System.out.println("Connection closed successfully!!!");
					}
				} catch (SQLException e) {
					System.out.println("Error while closing the connection!!");
					e.printStackTrace();
				}
			}
			return std;
		}

		public List<Student> getAllStudents() {
			Connection con = null;
			List<Student> studentsList = new ArrayList<>();
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prowings", "root", "root");
				Statement stmt = con.createStatement();

				ResultSet result = stmt.executeQuery("select * from student");

				while (result.next()) {
					Student student = new Student();
					student.setId(result.getInt(1));
					student.setName(result.getString(2));
					student.setSubject(result.getString(3));
					student.setRollNo(result.getInt(4));
					studentsList.add(student);
				}

				if (studentsList.isEmpty()) {
					System.out.println("No students found");
				}
			} catch (SQLException e) {
				System.out.println("Some exception occurred while connecting to the DB!!");
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
						System.out.println("Connection closed successfully!!!");
					}
				} catch (SQLException e) {
					System.out.println("Error while closing the connection!!");
					e.printStackTrace();
				}
			}
			return studentsList;
		}

		public boolean deleteStudent(int id) {

			Connection con = null;

			boolean flag = false;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prowings", "root", "root");
				Statement stmt = con.createStatement();

				int res = stmt.executeUpdate("delete from student where id=" + id);

				if (res > 0) {
					flag = true;
				} else {
					flag = false;
				}

			} catch (SQLException e) {
				System.out.println("Some exception occurred while connecting to the DB!!");
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
						System.out.println("Connection closed successfully!!!");
					}
				} catch (SQLException e) {
					System.out.println("Error while closing the connection!!");
					e.printStackTrace();
				}
			}
			return flag;

		}

}

