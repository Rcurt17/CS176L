package Week6Answer;
import java.util.Scanner;

public class Problem3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String Input = scanner.nextLine();

	        if (containsNumericCharacter(Input) == true) {
	            System.out.println("The input string contains numerical characters.");
	        } else {
	            System.out.println("The input string does not contain any numerical characters.");
	        }

	        scanner.close();
	    }

	    public static boolean containsNumericCharacter(String input) {
	        for (int i = 0; i < input.length(); i++) {
	            char character = input.charAt(i);
	            if (character >= '0' && character <= '9') {
	                return true; // Found a numerical character
	            }
	        }
	        return false; // No numerical characters found
	    }
	}


