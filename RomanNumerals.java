package Week11_Answer;
import java.util.Scanner;

public class RomanNumerals {
	
	public static String integerToRoman(int num) {
		
		int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder string = new StringBuilder();
		int count =0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			while (num >= numbers[i]) {
				
				string.append(romanNumerals[i]);
				
				num -= numbers[i];
				
			}
		}
		return string.toString();
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number to get the roman numeral: ");
		int digit = input.nextInt();
		
		System.out.println("The roman numeral for " + digit + " is ");
		System.out.println(integerToRoman(digit));
		

	}

}
