package Phase1.Jav.Project2;

import java.util.Scanner;

public class emailValidation {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		String[] stringArray = new String[] { "karan1@gmail.com", "karan2@gmail.com", "karan3@gmail.com",
				"karan4@gmail.com", "karan5@gmail.com" };
		boolean found = false;

		System.out.println("Enter the email to be looked up");
		String searchedValue = scr.next();

		for (String x : stringArray) {
			if (x.equals(searchedValue)) {
				found = true;

				break;

			}
		}

		if (found == true) {

			System.out.println("This is a valid email");
		} else {

			System.out.println("This is an inavlid email");
		}

		System.out.println();
		
		scr.close();

	}
}
