package Week14Answer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PositiveIntegerChecker {

	public static void main(String[] args) {
		
		try {
			FileReader FR = new FileReader("NumberList.txt");
			
			String fPath = "NumberList.txt";
			
			BufferedReader r = new BufferedReader(FR);
			
			String line;
			
			while ((line = r.readLine()) != null) {
				int number = Integer.parseInt(line);
				if (number > 0) {
					throw new PositiveNumberException("Positive numbers found: " + number);
				}
			}
			r.close();
			System.out.println("All numbers are not positive");
			
		} catch (IOException | NumberFormatException e) {
			System.err.println("Could not read file: " + e.getMessage());
		} catch (PositiveNumberException e) {
			System.err.println(e.getMessage());
			
		}
		
	
	}

}

class PositiveNumberException extends Exception {
	public PositiveNumberException(String message) {
		super(message);
	}
}
