
package FwlasneWielokat;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int[] tableOfLenght = new int[5];
	public static Scanner scanner = new Scanner(System.in);
	int circut;

	public static void main(String[] args) {
		checkSides();
		showCircut();
	}

	public static void checkSides() {
		if (tableOfLenght.length < 3) {
			System.out.println("nie da sie zbudowac wielokata");
		} else {
			if (tableOfLenght.length <= 7) {

				for (int i = 0; i < tableOfLenght.length; i++) {
					System.out.println("wprowadz dlugosc boku");
					tableOfLenght[i] = getScanner().nextInt();
				}
			} else {
				Random generator = new Random();
				for (int i = 0; i < tableOfLenght.length; i++) {
					tableOfLenght[i] = generator.nextInt(12) + 1;
				}
			}
		}
	}

	public static int showCircut() {
		int circut = 0;
		for (int i = 0; i < tableOfLenght.length; i++) {
			circut = circut + tableOfLenght[i];
		}
		System.out.println("obwod wielokata wynosi: "+circut);
		return circut;

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
