//class /blueprint
public class Animals {
	//properties/variables/attributes
	public String color;
//	public String size;
//	public double weight;
	public String foodType;
	public int numberOfLegs;
	
	Animals(String colorFromCons,int numberOfLegsFromCons){
		this.color=colorFromCons;
		this.numberOfLegs = numberOfLegsFromCons;
		System.out.println("im constructor");
	}
	
	
	//method
	public void run() {
		
		System.out.println("running");
	}
	public void eat() {
		System.out.println("eating");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	
	

}
