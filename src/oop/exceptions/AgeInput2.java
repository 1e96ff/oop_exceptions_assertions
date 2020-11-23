package oop.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInput2 {
	private static final String DEFAULT_MESSAGE = "Your age: ";
	private Scanner scanner;

	public AgeInput2() {
		scanner = new Scanner(System.in);
	}

	public int getAge() {
		return getAge(DEFAULT_MESSAGE);
	}

	public int getAge(String prompt) {
		int age = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.print(prompt);
			try {
				age = scanner.nextInt();
				keepGoing = false;
			} catch (InputMismatchException e) {
				scanner.next(); // remove the leftover garbage
				// from the input buffer
				System.out.println("Invalid Entry.Please enter digits only.");
			}
		}
		return age;
	}

	public static void main(String[] args) {
		GregorianCalendar today;
		int age, thisYear, bornYr;
		String answer;
		Scanner scanner = new Scanner(System.in);
		AgeInput2 input = new AgeInput2();
		age = input.getAge("How old are you? ");
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
