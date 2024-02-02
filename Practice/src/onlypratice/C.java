package onlypratice;

public class C {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dog d=new Dog(1,"Harry","Biscuit");
		
		Dog d1=(Dog) d.clone();

	System.out.println(d.name);
	d.setName("Tobby");
	System.out.println(d.name);
	
	
	System.out.println(d1.name);
	d1.setName("Bobby");
	System.out.println(d1.name);
		
	}
}
class Dog implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Dog(int id, String name, String food) {
		super();
		this.id = id;
		this.name = name;
		this.food = food;
	}
	int id;
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	String name;
	String food;
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", food=" + food + "]";
	}
	
}