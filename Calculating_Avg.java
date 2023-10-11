package Week6Answer;
import java.util.Scanner;

public class Calculating_Avg {

	public static void main(String[] args) {
		int Counter = 1;
		double Total = 0;
		final int MINSCORE = 0;
		final int MAXSCORE = 100;
		double Average;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to cacluating average grade!");
		
		System.out.println();
		
		System.out.print("Please enter your name: ");
		String name = input.next();
		
		System.out.println();
		
		System.out.print("Hello "+ name + " how many scores would you like to input? ");
		int examNumber = input.nextInt();
		
		
		while (Counter <= examNumber) {
			System.out.print("Enter your grade for exam "+Counter+":");
			
			double examScore = input.nextDouble();
			
			if (examScore < MINSCORE || examScore > MAXSCORE) {
				
				System.out.println("Invalid score, please type again");
				
			} else {
				
				Total += examScore;
				Counter++;
			}
			
		}
		Average = Total / examNumber;
		
		System.out.println("Your average is " + Average);
		
		input.close();
	}

}
