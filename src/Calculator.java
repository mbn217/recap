
public class Calculator {

	int num1;
	int num2;
	int num3 ;
	String typeOfCalculation;

	
	Calculator(){
		System.out.println("im in the def contructor");
	}
	
	Calculator(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
		System.out.println("------");
	}
	

	
	public String sum() {
		int total = num1 + num2;
		System.out.println("the sum of " + num1 + 
				" and " + num2 + " is " + total);
		
			if (total<100) {
				return "the total is less or equal to 100";
				
			}else if (total>100) {
				
				return "the total is greater to 100";
				
			}
		return "anything else";
		

	}
	
	
	
	
	


}
