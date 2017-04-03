package wielokat;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tableOfLenght = new int[5];

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
			int circut = 0;
			for (int i = 0; i < tableOfLenght.length; i++) {
				circut = circut + tableOfLenght[i];
			}
			System.out.println(circut);
		}
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
