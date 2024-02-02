package onlypratice;



enum Laptop
{
	ASUS(100),HP(200),LENOVO,CHROMEBOOK(600),MACBOOK(2000);

	
	private Laptop() {
		price=450;
	}
	private int price;
	Laptop(int i) {
		this.setPrice(i);
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class EnumLaptopWithPrice 
{
	public static void main(String[] args)
	{
		Laptop [] lap=Laptop.values();
		for(Laptop lap1: lap)
		{
			System.out.println(lap1+ "             :"+lap1.getPrice());
		}
		}

}
