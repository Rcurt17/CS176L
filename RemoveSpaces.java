package Week8_Problems;
import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String noSpace = "";
		
		System.out.print("Enter a string to remove the spaces: ");
		String line = input.nextLine();
		
		for (int i = 0; i < line.length(); i++) {
			
			char ch = line.charAt(i);
			
			if (!Character.isWhitespace(ch)) {
				noSpace += ch;
			}
		}
		System.out.println(noSpace);
	}

}
