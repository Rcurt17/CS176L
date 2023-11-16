package Week11_Answer;
import java.util.*;

public class RomanNumerals2 {
	
	
	int number(char character) {
		
		if (character == 'I') {
			return 1;
		}
		
		if (character == 'V') {
			return 5;
		}
		
		if (character == 'X') {
			return 10;
		}
		
		if (character == 'L') {
			return 50;
		}
		
		if (character == 'C') {
			return 100;
		}
		
		if (character == 'D') {
			return 500;
		}
		
		if (character == 'M') {
			return 1000;
		}
		
		return -1;
	}
	
	int romanToNumber(String numerals) {
		
		int finalAnswer = 0;
		
		for (int i = 0; i < numerals.length(); i++) {
			
			int symbol1 = number(numerals.charAt(i));
			
			if (i + 1 < numerals.length()) {
				
				int symbol2 = number(numerals.charAt(i + 1));
				
				if (symbol1 >= symbol2) {
					finalAnswer = finalAnswer + symbol1;
				
				} else {
					finalAnswer = finalAnswer + symbol2 - symbol1;
					i++;
				}
			
			}
			 else {
					finalAnswer = finalAnswer + symbol1;
			}
		}
		return finalAnswer;
	}

	public static void main(String[] args) {
		
		RomanNumerals2 RomanNumber = new RomanNumerals2();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a roman numeral to get back the answer: ");
		String romanNumerals = input.nextLine();
		
		System.out.println("The integer form of " + romanNumerals + " is " + 
		RomanNumber.romanToNumber(romanNumerals));
		
		
		

	}

}
