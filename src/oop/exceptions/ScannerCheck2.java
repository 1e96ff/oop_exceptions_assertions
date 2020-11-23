package oop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerCheck2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("Enter input: ");
				int num = scanner.nextInt();
			}
		} catch (InputMismatchException e) {
			scanner.next();
			System.out.println("Invalid Entry");
		}
	}
}
