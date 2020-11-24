package oop.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInput3 {
//	private static final String DEFAULT_MESSAGE = "Your age: ";
//	private Scanner scanner;
//
//	public AgeInput3() {
//		scanner = new Scanner(System.in);
//	}
//
//	public int getAge() {
//		return getAge(DEFAULT_MESSAGE);
//	}

	public int getAge(String prompt, Scanner scanner) {
		int age = 0;
		while (true) {
			System.out.print(prompt);
			try {
				age = scanner.nextInt();
				if (age < 0) {
					throw new Exception("Negative age is invalid");
				}
				return age;
			} catch (InputMismatchException e) {
				scanner.next(); // remove the leftover garbage
				// from the input buffer
				System.out.println("Invalid Entry.Please enter digits only.");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		GregorianCalendar today;
		int age, thisYear, bornYr;
		String answer;
		
		Scanner scanner = new Scanner(System.in);
		AgeInput3 input = new AgeInput3();
		age = input.getAge("How old are you? ", scanner);
		today = new GregorianCalendar();
		thisYear = today.get(Calendar.YEAR);
		bornYr = thisYear - age;
		
		System.out.print("Already had your birthday this year? (Y or N)");
		answer = scanner.next();
		if (answer.equals("N") || answer.equals("n")) {
			bornYr--;
		}
		System.out.println("\nYou are born in " + bornYr);
	}
}
