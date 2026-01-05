//2.Password Validation Loop
//Ask user for a password.
//Continue asking while length < 8
//(show message “Password too short”).



package com.index;

import java.util.Scanner;

public class Looping_assi2q2 {

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		String password = "";
		
		while(password . length() <8) {
			
			System.out.println("entry the password");
			 
			password=obj.nextLine();
			System.out.println("password too short");
		}
           
		System.out.println("Password Accepted");
	}

}
