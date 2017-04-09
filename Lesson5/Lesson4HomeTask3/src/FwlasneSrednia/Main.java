
package FwlasneSrednia;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static int isHalf, i;
	public static double avarrage, sum;
	public static double[] tableOfMarksP = new double[4];
	public static double[] tableOfMarksG = new double[6];
	public static double[] tableOfMarksL = new double[7];

	public static Scanner scanner = new Scanner(System.in);
	public static Random generator = new Random();

	public static void main(String[] args) {


		System.out.println("wybierz szkole do ktorej uczeszcza uczen");
		System.out.println("1.Podstawowka");
		System.out.println("2.Gimnazjum");
		System.out.println("3.Liceum");

		int subject = getScanner().nextInt();
		switch (subject) {
		case 1:
			System.out.println("1.Podstawowa");
			generateMarks(tableOfMarksP);
			System.out.println("srednia jest rowna: " + calculateAvarrage(tableOfMarksP));
			System.out.println("mediana jest rowna: " + mediana(tableOfMarksP));
			getWorrning(tableOfMarksP);
			System.out.println("najlepsza ocena jest rowna: " + getBestMark(tableOfMarksP));
			System.out.println("najgorsza ocena jest rowna: " + getWorstMark(tableOfMarksP));
			break;
		case 2:
			System.out.println("2.Gimnazjum");
			generateMarks(tableOfMarksG);

			System.out.println("srednia jest rowna: " + calculateAvarrage(tableOfMarksG));
			System.out.println("mediana jest rowna: " + mediana(tableOfMarksG));
			getWorrning(tableOfMarksG);
			System.out.println("najlepsza ocena jest rowna: " + getBestMark(tableOfMarksG));
			System.out.println("najgorsza ocena jest rowna: " + getWorstMark(tableOfMarksG));
			break;
		case 3:
			System.out.println("3.Liceum");

			generateMarks(tableOfMarksL);
			System.out.println("srednia jest rowna: " + calculateAvarrage(tableOfMarksL));
			System.out.println("mediana jest rowna: " + mediana(tableOfMarksL));
			getWorrning(tableOfMarksL);
			
	
			System.out.println("najlepsza ocena jest rowna: " + getBestMark(tableOfMarksL));
			System.out.println("najgorsza ocena jest rowna: " + getWorstMark(tableOfMarksL));
			break;
		default:
			System.out.println("nie wybrales zadnej szkoly");
			break;
		}

	}

	public static double calculateAvarrage(double[] tableOfMarks) {
		sum = 0;
		for (int i = 0; i < tableOfMarks.length; i++) {
			sum = sum + tableOfMarks[i];
		}

		return sum / tableOfMarks.length;
	}

	public static double mediana(double[] tableOfMarks) {

		Arrays.sort(tableOfMarks);
		if (tableOfMarks.length % 2 == 0) {
			int mediumIndex = tableOfMarks.length / 2;
			return (tableOfMarks[mediumIndex] + tableOfMarks[mediumIndex - 1]) / 2;
		} else {
			return tableOfMarks[tableOfMarks.length / 2];
		}

	}

	public static void generateMarks(double[] tableOfMarks) {
		for (int i = 0; i < tableOfMarks.length; i++) {
			tableOfMarks[i] = generator.nextInt(6) + 1;

			if (tableOfMarks[i] != 6) {

				if (generator.nextBoolean()) {
					tableOfMarks[i] += 0.5;
					System.out.println(tableOfMarks[i] + 0.5);
				} else {
					System.out.println(tableOfMarks[i]);
				}
			}
		}
	}

	public static void getWorrning(double [] tableOfMarks) {

		for (int i = 0; i < tableOfMarks.length; i++) {
			if (tableOfMarks[i] == 1) {
				System.out.println("zagrozenie!");
				break;
			}
		}
	}

	public static double getBestMark(double [] tableOfMarks) {
	
		double max = tableOfMarks[0];
	    for (int i=1; i<tableOfMarks.length; i++) {
	        max = (tableOfMarks[i] > max)? tableOfMarks[i] : max;
	    }
	    return max;
	}

	public static double getWorstMark(double [] tableOfMarks) {
		double min = tableOfMarks[0];
	    for (int i=1; i<tableOfMarks.length; i++) {
	        min = (tableOfMarks[i] < min)? tableOfMarks[i] : min;
	    }
	    return min;
	}

	
	
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}