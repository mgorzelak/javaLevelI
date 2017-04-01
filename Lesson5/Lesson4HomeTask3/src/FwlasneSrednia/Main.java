
package FwlasneSrednia;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static int isHalf, i;
	public static double avarrage, sum;
	public static int[] tableOfMarks = new int[4];
	public static int[] tableOfMarksG = new int[6];
	public static int[] tableOfMarksL = new int[7];

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("wybierz szkole do ktorej uczeszcza uczen");
		System.out.println("1.Podstawowka");
		System.out.println("2.Gimnazjum");
		System.out.println("3.Liceum");

		int subject = getScanner().nextInt();
		switch (subject) {
		case 1:
			System.out.println("1.Podstawowa");

			for (int i = 0; i < tableOfMarks.length; i++) {
				tableOfMarks[i] = generator.nextInt(6) + 1;

				if (tableOfMarks[i] != 6) {
					isHalf = generator.nextInt(2);
					if (isHalf == 1) {
						tableOfMarks[i] += 0.5;
						System.out.println(tableOfMarks[i] + 0.5);
					} else {
						System.out.println(tableOfMarks[i]);
					}
				}
			}
			showAvarrage();
			System.out.println("mediana jest rowna: " + mediana(tableOfMarks));
			getWorrning();
			break;
		case 2:
			System.out.println("2.Gimnazjum");

			for (int i = 0; i < tableOfMarksG.length; i++) {
				tableOfMarksG[i] = generator.nextInt(6) + 1;

				if (tableOfMarksG[i] != 6) {
					isHalf = generator.nextInt(2);
					if (isHalf == 1) {
						tableOfMarksG[i] += 0.5;
						System.out.println(tableOfMarksG[i] + 0.5);
					} else {
						System.out.println(tableOfMarksG[i]);
					}
				}
			}
			showAvarrageG();
			System.out.println("mediana jest rowna: " + mediana(tableOfMarksG));
			getWorrning();
			break;
		case 3:
			System.out.println("3.Liceum");

			for (int i = 0; i < tableOfMarksL.length; i++) {
				tableOfMarksL[i] = generator.nextInt(6) + 1;
				if (tableOfMarksL[i] != 6) {
					isHalf = generator.nextInt(2);
					if (isHalf == 1) {
						tableOfMarksL[i] += 0.5;
						System.out.println(tableOfMarksL[i] + 0.5);
					} else {
						System.out.println(tableOfMarksL[i]);
					}
				}
			}
			showAvarrageL();
			System.out.println("mediana jest rowna: " + mediana(tableOfMarksL));
			getWorrning();
			break;
		default:
			System.out.println("nie wybrales zadnej szkoly");
			break;
		}
	}

	public static void showAvarrageL() {
		sum = 0;
		for (int i = 0; i < tableOfMarksL.length; i++) {
			sum = sum + tableOfMarksL[i];
		}
		avarrage = sum / tableOfMarksL.length;
		System.out.println("srednia jest rowna: " + avarrage);
	}

	public static void showAvarrageG() {
		sum = 0;
		for (int i = 0; i < tableOfMarksG.length; i++) {
			sum = sum + tableOfMarksG[i];
		}
		avarrage = sum / tableOfMarksG.length;
		System.out.println("srednia jest rowna: " + avarrage);
	}

	public static void showAvarrage() {
		sum = 0;
		for (int i = 0; i < tableOfMarks.length; i++) {
			sum = sum + tableOfMarks[i];
		}
		avarrage = sum / tableOfMarks.length;
		System.out.println("srednia jest rowna: " + avarrage);
	}

	public static double mediana(int[] tableOfMarks) {
		double mediana = 0;
		double avarrage = 0.0;
		Arrays.sort(tableOfMarks);
		if (tableOfMarks.length % 2 == 0) {
			avarrage = tableOfMarks[tableOfMarks.length / 2] + tableOfMarks[(tableOfMarks.length / 2) - 1];
		} else {
			mediana = tableOfMarks[tableOfMarks.length / 2];
		}

		return mediana;
	}

	public static void getWorrning() {

		if (tableOfMarks[i] == 0)
			System.out.println("grozi zagrozenie!");
	}

	public static void getBestMark() {
		Arrays.sort(tableOfMarks);
		

	}

	public static void getWorstMark() {

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}