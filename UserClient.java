package com.urs.client;

import java.util.Scanner;

import com.urs.details.UserImpl;

public class UserClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		UserImpl daoimpl = new UserImpl();
		while (true) {
			System.out.println("==============================================");
			System.out.println("                 1. User Registration         ");
			System.out.println("                 2. User Login                ");
			System.out.println("                 3. Exit                      ");
			System.out.println("==============================================");

			System.out.println("Enter a choice ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				daoimpl.addUser();
				break;
			case 2:
				System.out.println("Enter your email");
				String email = scan.next();
				System.out.println("Enter your password");
				String pw = scan.next();
				if (daoimpl.loginUser(email, pw)) {

					System.out.println("Login Successful");
					System.out.println();
					UserClient ucl = new UserClient();
					ucl.main(args);
				} else {
					System.out.println("Please check your credentials");
				}
				break;

			case 3:
				System.out.println("Thank you for using the app");
				System.exit(0);

				break;
			default:
				System.out.println("Please enter number properly");

			}// end of switch
		} // end of while
	}// end of main

}
