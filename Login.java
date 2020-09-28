//package com.login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
	static final Scanner s=new Scanner(System.in);
	public static void FirstNameValidate(String name)
	{
		 String y="^[A-Z]{1}(?=.*[a-z]).{2,}$";
		
		  Pattern pattern = Pattern.compile(y);

          Matcher matcher =  pattern.matcher(name);

          boolean found = false;
          while (matcher.find()) {
              System.out.println("Valid first Name");
              found = true;
          }
          if(!found){
              System.out.println("Invalid first name");
	}

	}
	public static void LastNameValidate(String name)
	{
		 String y="^[A-Z]{1}(?=.*[a-z]).{2,}$";
		
		  Pattern pattern = Pattern.compile(y);

          Matcher matcher =  pattern.matcher(name);

          boolean found = false;
          while (matcher.find()) {
              System.out.println("Valid Last Name");
              found = true;
          }
          if(!found){
              System.out.println("Invalid last name");
	}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to login page");
		Scanner s1=new Scanner(System.in);
		String firstname=s1.nextLine();
		FirstNameValidate(firstname);
		String lastname=s1.nextLine();
		LastNameValidate(lastname);
		//MobileValidate(x);
	}
}
