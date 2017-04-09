package sudoku;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static int[][] sudokuTable = new int[9][9];
	public static int n, m, number;

	public static void main(String[] args) {
		Random generator = new Random();

		System.out.println("wybierz poziom trudnosci gry");
		System.out.println("1.Latwy");
		System.out.println("2.Sredni");
		System.out.println("3.Trudny");
		System.out.println("4.Hard");
		int levelOfGame = getScanner().nextInt();
		switch (levelOfGame) {
		case 1:
			System.out.println("1.Latwy");
			for (int i = 0; i < sudokuTable.length; i++)
	    	{
	    		System.out.print(" \n");
				for (int j = 0; j < sudokuTable.length; j++) {
					sudokuTable[i][j] = new Random().nextInt(9)+1;
					System.out.print(sudokuTable[i][j]+" ");	
				}
			}
			//show();
			break;
		case 2:
			System.out.println("2.Sredni");
			
			break;
		case 3:
			System.out.println("3.Trudny");
			break;
		case 4:
			System.out.println("4.Hard");
			break;
		default:
			System.out.println("nie wybrales zadnego poziomu trudnosci");
			break;
		}
	}

	// public static boolean removeRepetitions (){
	// for(int i=0;i<sudokuTable.length;i++)
	// {
	//for(int j=0;j<sudokuTable.length;j++)
	//{
	//	 if(i==m and j==n)return false;
	//	 if(tab[i][j]==number)return true;
	//	 }	
	//}}
    public static void show(){
    	for (int i = 0; i < sudokuTable.length; i++)
    	{
    		System.out.print(" \n");
			for (int j = 0; j < sudokuTable.length; j++) {
				sudokuTable[i][j] = new Random().nextInt(9)+1;
				System.out.print(sudokuTable[i][j]+" ");	
			}
		}

    	
    }
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
