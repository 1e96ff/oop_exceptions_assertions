package oop.exceptions;

public class AgeInputException extends Exception {
	private static final String DEFAULT_MESSAGE = "Input out of bounds";
	private int lowerBound;
	private int upperBound;
	private int value;

	public AgeInputException(int low, int high, int input) {
		this(DEFAULT_MESSAGE, low, high, input);
	}

	public AgeInputException(String msg, int low, int high, int input) {
		super(msg);
		if (low > high) {
			throw new IllegalArgumentException();
		}
		lowerBound = low;
		upperBound = high;
		value = input;
	}

	public int lowerBound() {
		return lowerBound;
	}

	public int upperBound() {
		return upperBound;
	}

	public int value() {
		return value;
	}
}
