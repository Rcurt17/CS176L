package Week5Answer;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String add = "+";
		String subtract = "-";
		String multiply = "*";
		String divide = "/";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first integer: ");
		
		double firstInt = input.nextDouble();
		
		System.out.println("Enter an operation: ");
		
		String operation = input.next();
		
		System.out.println("Enter your second integer: ");
		
		double secondInt = input.nextDouble();
		
		double sum = firstInt + secondInt;
		
		double difference = firstInt - secondInt;
		
		double product = firstInt * secondInt;
		
		double quotient = firstInt / secondInt;
		
		if (operation.equals(add)) {
			
			System.out.println(sum);
			
		} else if(operation.equals(subtract)) {
			
			System.out.println(difference);
		
		} else if(operation.equals(multiply)) {
			
			System.out.println(product);
			
		} else if(operation.equals(divide)) {
			
			System.out.println(quotient);
			
		} else {
				System.out.println("Please restart and put an valid operator");
			}
			
		}
		
		

	}


