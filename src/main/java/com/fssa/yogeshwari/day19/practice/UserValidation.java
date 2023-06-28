package com.fssa.yogeshwari.day19.practice;

import java.util.Scanner;
public class UserValidation {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the user id with digit that contain 8 digit");
		
		String userid=s.next();
		
		System.out.println("Enter the user name");
		String username=s.next();
		
		System.out.println("Enter the user password");
		String userpassword=s.next();
		
		System.out.println("Enter the user email");
		String useremail=s.next();
		s.close();
		
		
		
		User classuser=new User();
		classuser.setId(userid);
		classuser.setName(username);
		classuser.setPassword(userpassword);
		classuser.setEmail(useremail);
		
		
		
		try {
		
		boolean valid=UserValidator.validate(classuser);
	
		if(valid) {
			System.out.println("All details is in correct format");
		}
		
		
		
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		finally {
			System.out.println("The program is ended");
		}
		
	}
}









