package oop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerCheck1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int num1 = scanner.nextInt();
			System.out.println("Input 1 accepted");
			int num2 = scanner.nextInt();
			System.out.println("Input 2 accepted");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Entry");
		}
	}
}
