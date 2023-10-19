package Week7Answer;
import java.util.Scanner;

public class Palindrome {
	
	public static boolean palindromeTest(String input) {
		
		String reverse = "";
		
		boolean answer = false;
		
		for (int x = input.length() - 1; x >= 0; x-- ) {
			reverse = reverse + input.charAt(x);
		}
		
		if (input.equals(reverse)) {
			answer = true;
		}
		return answer;
		
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a string to check if it is a palindrome: ");
		
		String word = userInput.next();
		
		word = word.toLowerCase();
		
		boolean outcome = palindromeTest(word);
		
		if (outcome == true) {
			System.out.println("Your word is a palindrome :)");
			
		} else {
			System.out.println("Your word is not a palindrome :(");
		}
		

	}

}
