package oop.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// program mencari tahun lahir berdasarkan usia

public class AgeInput1 {
	public int getAge(String prompt, Scanner scanner) {
		System.out.print(prompt);
		int age = scanner.nextInt();
		return age;
	}

	public static void main(String[] args) {
		GregorianCalendar today;
		int age, thisYear, bornYr;
		String answer;
		
		Scanner scanner = new Scanner(System.in);
		AgeInput1 input = new AgeInput1();
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
