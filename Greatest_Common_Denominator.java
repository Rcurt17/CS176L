package Week7Answer;
import java.util.Scanner;

public class Greatest_Common_Denominator {
	
	final int LOWERLIMIT = 0;
	final int UPPEERLIMIT = 1000;
	
	
	static int returningGCD(int NUM1, int NUM2) {
		int greatestCommonDenominator = 1;
		
		for (int x = 1; x <= NUM1 && x <= NUM2; x++) {
			if (NUM1 % x == 0 && NUM2 % x ==0) {
				greatestCommonDenominator = x;
			}
		}
		return greatestCommonDenominator;
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input two numbers to find out the GCD: ");
		int NUM1 = input.nextInt();
		int NUM2 = input.nextInt();
		
		int GCD = returningGCD(NUM1, NUM2);
		
		System.out.println("The GCD of "+ NUM1+ " and "+ NUM2 +" is " + GCD);

	}

}
