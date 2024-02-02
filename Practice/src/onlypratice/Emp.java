package onlypratice;

public class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	

}
