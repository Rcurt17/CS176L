package Week8_Problems;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder("");
		
		System.out.println("Enter a string you want to reverse: ");
		String line = input.nextLine();
		
		for (int i  =  line.length()-1; i >= 0; i--) {
			char c = line.charAt(i);
			str.append(c);
		}
		System.out.println(str.toString());
	}

}
