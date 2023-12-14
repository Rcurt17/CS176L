package Week14Answer;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateException {

	public static void main(String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
			
			ArrayList<Integer> numberList = new ArrayList<>();
			
			System.out.println("Enter a set of numbers separated with a space");
			
			while (input.hasNextInt()) {
				int numberListNumber = input.nextInt();
				if (hasDuplicate(numberList, numberListNumber)) {
					throw new DuplicateExceptionNumber("Another number that is the same was found: " + numberListNumber);
				}
				numberList.add(numberListNumber);
			}
			input.close();
			System.out.println("There were no duplicates");
			
		} catch (DuplicateExceptionNumber e) {
			System.err.println(e.getMessage());
		}

	}
	
	private static boolean hasDuplicate(ArrayList<Integer> numberList, int numberListNumber) {
		for (int x : numberList) {
			if (x == numberListNumber) {
				return true;
			}
		}
		return false;
	}

}

class DuplicateExceptionNumber extends Exception {
	public DuplicateExceptionNumber(String message) {
		super(message);
	}
}
