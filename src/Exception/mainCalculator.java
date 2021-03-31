package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class mainCalculator {

	public static void main(String[] args)  {
		
		Calculator cal = new Calculator();
		
		try {
			cal.devide();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}

}
