package Week5Answer;
import java.util.Scanner;

public class Replacing_Digits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String stringline = input.nextLine();
		
		char firstCharacter = stringline.charAt(0);
		
		boolean ifTrue = Character.isDigit(firstCharacter);
		
		if (ifTrue == true) {
			if (firstCharacter == '0') {
				System.out.println("zero"+ stringline.substring(1));
				
			} else if (firstCharacter == '1') {
				System.out.println("one"+ stringline.substring(1));
					
			} else if (firstCharacter == '2') {
				System.out.println("two"+ stringline.substring(1));
				
			} else if (firstCharacter == '3') {
				System.out.println("three"+ stringline.substring(1));
				
			} else if (firstCharacter == '4') {
				System.out.println("four"+ stringline.substring(1));
				
			} else if (firstCharacter == '5') {
				System.out.println("five"+ stringline.substring(1));
				
			} else if (firstCharacter == '6') {
				System.out.println("six"+ stringline.substring(1));
				
			} else if (firstCharacter == '7') {
				System.out.println("seven"+ stringline.substring(1));
				
			} else if (firstCharacter == '8') {
				System.out.println("eight"+ stringline.substring(1));
				
			} else if (firstCharacter == '9') {
				System.out.println("nine"+ stringline.substring(1));
				
			}
			
		} else {
			System.out.println(stringline);
		}

	
	}

}
