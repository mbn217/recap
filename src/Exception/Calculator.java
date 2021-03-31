package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.ArithmeticException;;

public class Calculator {
	//MyAwesomeException aw = new MyAwesomeException();	
	
	
	

	void devide() throws MyAwesomeException {
		int total = 20+400;
			if (total>100) {
				throw new MyAwesomeException();
			}else {
				System.out.println("no expcetion here");
			}
			
	}

}
