package srednia;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("wybierz szkole do ktorej uczeszcza uczen");
		System.out.println("1.Podstawowka");
		System.out.println("2.Gimnazjum");
		System.out.println("3.Liceum");
		int isHalf;
		double avarrage, sum;
		
		int subject = getScanner().nextInt();
		switch (subject) {
		case 1:
			System.out.println("1.Podstawowa");

			int[] tableOfMarks = new int[4];

			for (int i = 0; i < tableOfMarks.length; i++) {
				tableOfMarks[i] = generator.nextInt(6) + 1;
				// System.out.println(tableOfMarks[i]);
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
			sum=0;
	        for(int i=0; i<tableOfMarks.length; i++)
	        {
	            sum=sum+tableOfMarks[i];

	        }
	        avarrage=sum/tableOfMarks.length;
	        System.out.println("srednia jest rowna: "+avarrage);
			break;
		case 2:
			System.out.println("2.Gimnazjum");

			int[] tableOfMarksG = new int[6];

			for (int i = 0; i < tableOfMarksG.length; i++) {
				tableOfMarksG[i] = generator.nextInt(6) + 1;
				// System.out.println(tableOfMarksG[i]);
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
			sum=0;
	        for(int i=0; i<tableOfMarksG.length; i++)
	        {
	            sum=sum+tableOfMarksG[i];

	        }
	        avarrage=sum/tableOfMarksG.length;
	        System.out.println("srednia jest rowna: "+avarrage);
			break;
		case 3:
			System.out.println("3.Liceum");

			int[] tableOfMarksL = new int[7];

			for (int i = 0; i < tableOfMarksL.length; i++) {
				tableOfMarksL[i] = generator.nextInt(6) + 1;
				// System.out.println(tableOfMarks[i]);
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
			sum=0;
	        for(int i=0; i<tableOfMarksL.length; i++)
	        {
	            sum=sum+tableOfMarksL[i];

	        }
	        avarrage=sum/tableOfMarksL.length;
	        System.out.println("srednia jest rowna: "+avarrage);
			break;
		default:
			System.out.println("nie wybrales zadnej szkoly");
			break;
		}
		
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
