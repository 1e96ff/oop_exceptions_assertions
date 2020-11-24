package oop.exceptions;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestAgeInput4 {
	public static void main(String[] args) {
		GregorianCalendar today;
		int age = 0, thisYear, bornYr;
		String answer;
		
		Scanner scanner = new Scanner(System.in);
		AgeInput4 input = new AgeInput4();
		try {
			age = input.getAge("How old are you? ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
