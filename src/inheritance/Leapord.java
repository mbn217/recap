package inheritance;

public class Leapord extends Animals{
	
	
	private boolean isFast;
	
	

	
	public boolean isFast() {
		return isFast;
	}


	public void setFast(boolean isFast) {
		this.isFast = isFast;
	}


	void jump() {
		System.out.println("leapord jumps");
	}
	

	@Override
	void walk() {
		System.out.println("Walking fast");
	}
}
