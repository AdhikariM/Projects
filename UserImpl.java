package com.urs.details;

import java.util.Scanner;

import com.urs.bean.User;
import com.urs.client.UserClient;

public class UserImpl {
	
	static User  addUser[];
	Scanner scan = new Scanner (System.in);
	public void addUser() {
		//User  addUser[];
		
		
		
		System.out.println("Do you want to register a new user? (Yes/No)");
		String ch1 = scan.next();
		String ch =ch1.toLowerCase();
		
		if (ch.equals("yes")) {
			
			addUser = new User[1];
			for( int i =0; i<addUser.length;++i) {
			System.out.println("Enter an Id for the user");
			int id = scan.nextInt();
			System.out.println("Enter the first name");
			String fname = scan.next();
			System.out.println("Enter the last name");
			String lname = scan.next();
			System.out.println("Enter your email");
			String email = scan.next();
			System.out.println("Enter your desired password");
			String pw = scan.next();
			User user = new User(id, fname, lname, email, pw);
			addUser[i]= user;
			System.out.println("The User has been registered");
			
			
			}
			
		}//end of if
	else 
	{
		System.out.println("Taking you back to the main menu");
			UserClient cl = new UserClient();
			UserClient.main(null);
	}
	}// end of addUser
	
	public boolean loginUser(String email, String pass)
	{
		boolean flag = false;
		
		if(addUser != null)
		{
			for(User r: addUser)
			{
				if(email.equals(r.getEmail()) && (pass.equals(r.getPw())))
				{
					flag = true;
				}
			}
		}
		return flag;
	}

}//end of class
