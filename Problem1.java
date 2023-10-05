package Week5Answer;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter one name: ");
		String firstName = input.next();
		
		System.out.println("Enter second name: ");
		String secondName = input.next();
		
		boolean sameName = firstName.equals(secondName);
		
		if(sameName == true) {
			
			System.out.println("They are the same" + " " + sameName);
			
		}	else {
			
			System.out.println("Name 1 and name 2 do not match.");
		}

	}

}
