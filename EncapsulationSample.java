
class Furniture1
{
	private String name;
	private String shape;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
public class EncapsulationSample {

	public static void main(String[] args) {
			Furniture1 f=new Furniture1();
			
			f.setName("Bed");
			f.setPrice(30000.00);
			f.setShape("King Size");
			
			
			System.out.println(f.getName());
			System.out.println(f.getPrice());
			System.out.println(f.getShape());
		}										
}
		



		