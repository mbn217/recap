package inheritance;

public class Animals {
	
	
	String bodyType;
	int numberOfLegs;
	private int age;
	String color;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	

	void walk() {
		System.out.println("Walking ");
	}
	void sleep() {
		System.out.println("Sleeping ...");
	}
	
	
	

}
