package Phase1.Jav.Project2;

import java.util.Scanner;
import java.util.ArrayList;

public class emailValidation {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		ArrayList<String> emailCheck = new ArrayList<String>();

//		System.out.println("Enter the Email Id's for the List");
		
		// Array list of Email.

		emailCheck.add("karan1@gmail.com");
		emailCheck.add("karan2@gmail.com");
		emailCheck.add("karan3@gmail.com");
		emailCheck.add("karan4@gmail.com");
		emailCheck.add("karan5@gmail.com");
		////		emailID.add(scr.next());
		////		emailID.add(scr.next());
		

		System.out.println("Enter the email to be searched");
		
		
		// Taking User Input from Scanner
		
		
		String searchId = scr.nextLine();

		for (int i = 0; i < emailCheck.size(); i++) {

			if (searchId.contains(emailCheck.get(i))) {

				System.out.println("email ID - " + searchId + "   found");
			}

			else if(searchId !=emailCheck.get(i)) {

					System.out.println("The email " +searchId + " is invalid!");
				}

				break;

			}
		
		scr.close();
		
		}


		

	}


