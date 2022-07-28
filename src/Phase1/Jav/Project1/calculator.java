package Phase1.Jav.Project1;

import java.util.*;

public class calculator {


	public static void main(String[] args) {
		
		//Welcome Message

		System.out.println("---------------------------------- \n" +
				"Calculator \n");
		System.out.println("Following operations are supported : \n" +
				"1. Addition (+) \n" +
				"2. Subtraction (-) \n" +
				"3. Multiplication (*) \n" +
				"4. Division (/) \n");
		
		//Using scanner to take input

		Scanner scanner = new Scanner(System.in);
		
		//Operator Intake

		System.out.println("Enter an operator: + OR - OR * OR / ");
		char operation = scanner.next().charAt(0);

		System.out.println("Enter the first number: ");
		double number1 = scanner.nextDouble();

		System.out.println("Enter the second number: ");
		double number2 = scanner.nextDouble();


		if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
			System.out.println("Invalid Operator. Please use only + or - or * or /");
		}
		
		//Divide by zero error check

		if (operation == '/' && number2 == 0.0) {
			System.out.println("The second number cannot be zero for division operation.");
		}

		// Calculation Part

		if (operation == '+') {
			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
		} else if (operation == '-') {
			System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		} else if (operation == '*') {
			System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
		} else if (operation == '/') {
			System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
		}// else {
		//	System.err.println("Invalid Operator Specified.");
	//	}

		
		scanner.close();


	}



}
