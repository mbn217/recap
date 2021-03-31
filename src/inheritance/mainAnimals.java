package inheritance;

public class mainAnimals {

	public static void main(String[] args) {
		

		
		Turtle turtle = new Turtle();
		turtle.swim();
		turtle.bodyType = "circle";
		turtle.color="green";
		System.out.println("turtule ---"+
				turtle.bodyType+"--"+turtle.color);
		turtle.walk();
		
		System.out.println("----------------------");
		
		
		Leapord leapord = new Leapord();
		leapord.jump();
		leapord.bodyType = "big shape";
		leapord.color="yellow and black ";
		System.out.println("leapord ---"+
				leapord.bodyType+"--"+leapord.color);
		
		leapord.walk();
		leapord.setFast(true);
		System.out.println("the leapard is fast? "+leapord.isFast());

		
		leapord.setAge(44);
		System.out.println("age -- "+ leapord.getAge());
	}

	
	

	
}
