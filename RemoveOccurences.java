package Week8_Problems;
import java.util.Scanner;

public class RemoveOccurences {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String line = input.nextLine();
		System.out.println("Enter a letter you would like to remove: ");
		String letter = input.nextLine();
		
		String removeLetter = line.replaceAll(letter, "");
		
		System.out.println(removeLetter);
	}

}
