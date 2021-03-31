package Abstraction;

public class mainShape {

	public static void main(String[] args) {
		
		Shape obj1 = new Shape();
		obj1.num1 = 12;
		System.out.println("instance variable "+obj1.num1);
		obj1.calculate();
		
		
		
		Shape obj2 = new Shape();
		obj2.num1 = 15;
		System.out.println("instance variable "+obj2.num1);
		
		System.out.println("++++++++++");
		

		Shape.num2 = 12;
		System.out.println("class/static variable "+Shape.num2);
		
		
		

		System.out.println("class/static variable "+Shape.num2);
		Shape.calulate2();
		
	}

}
