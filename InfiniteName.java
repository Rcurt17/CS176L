package Week6Answer;
import java.util.Scanner;

public class InfiniteName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = input.next();
		
		input.close();
		
		while(true) {
			System.out.println(name);
		}
	}
}
