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
              System.out.println("Invalid last name");
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
	public static void EmailValidate(String email)
	{
		 String number="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
		
		  Pattern pattern = Pattern.compile(number);

          Matcher matcher =  pattern.matcher(email);

          boolean found = false;
          while (matcher.find()) {
              System.out.println("Valid email");
              found = true;
          }
          if(!found){
              System.out.println("Invalid email");
	}

	}
	public static void MobileValidate(String name)
	{
		 String number="^\\d{2}(\\s{1}\\d{10})$";
		
		  Pattern pattern = Pattern.compile(number);

          Matcher matcher =  pattern.matcher(name);

          boolean found = false;
          while (matcher.find()) {
              System.out.println("Valid Number");
              found = true;
          }
          if(!found){
              System.out.println("Invalid Number");
	}

	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to login page");
		System.out.println("Enter first name:");
		Scanner s1=new Scanner(System.in);
		String firstname=s1.nextLine();
		FirstNameValidate(firstname);
		System.out.println("Enter last name: ");
		String lastname=s1.nextLine();
		LastNameValidate(lastname);
		System.out.println("Enter phone number: ");
		String phn=s1.nextLine();
		MobileValidate(phn);
		System.out.println("Enter email: ");
		String email=s1.nextLine();
		EmailValidate(email);
	}
}
