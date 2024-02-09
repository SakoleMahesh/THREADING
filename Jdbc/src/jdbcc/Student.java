package jdbcc;

public class Student 
{
	int id;
	String name;
	String subject;
	String rollno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String i) {
		this.rollno = i;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", rollno=" + rollno + "]";
	}
}
