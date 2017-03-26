package fibo;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("podaj ile chcesz miec wyrazow ciagu");
		int numberOfFibonacci = getScanner().nextInt();
		int firstNumber = 0;
		int secondNumber = 1;

		if (numberOfFibonacci == 0) {
			System.out.println(firstNumber);
			System.out.println("suma jest rowna " + firstNumber);
		} else if (numberOfFibonacci == 1) {
			System.out.println(firstNumber + ", " + secondNumber);
			System.out.println("suma jest rowna " + (firstNumber + secondNumber));
		} else {

			String nextNumbers = "0,1";
			int suma = firstNumber + secondNumber;
			for (int i = 2; i <= numberOfFibonacci; i++) {
				secondNumber = firstNumber + secondNumber;
				firstNumber = secondNumber - firstNumber;
				nextNumbers = nextNumbers + "," + secondNumber;
				suma = suma + secondNumber;
			}
			System.out.println(nextNumbers);
			System.out.println("suma jest rowna:" + suma);
		}

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
