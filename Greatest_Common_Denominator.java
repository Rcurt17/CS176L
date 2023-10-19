package Week7Answer;
import java.util.Scanner;

public class Greatest_Common_Denominator {
	
	
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
		
		final int LOWERLIMIT = 0;
		final int UPPERLIMIT = 1000;
		
		Scanner input = new Scanner(System.in);
		
		int NUM1 = 0;
		int NUM2 = 0;
		
		boolean goodNumber = false;
		
		while (goodNumber == false) {
			
			System.out.print("Input two numbers to find out the GCD: ");
			
			 NUM1 = input.nextInt();
			 NUM2 = input.nextInt();
			
			if (NUM1 < LOWERLIMIT 
					|| NUM2 < LOWERLIMIT 
					|| NUM1 > UPPERLIMIT 
					|| NUM2 > UPPERLIMIT) {
				
				System.out.println("Please enter valid numbers");
			
			} else {
				goodNumber = true;
			}
		}
		
		int GCD = returningGCD(NUM1, NUM2);
		
		System.out.println("The GCD of "+ NUM1+ " and "+ NUM2 +" is " + GCD);

	}

}
