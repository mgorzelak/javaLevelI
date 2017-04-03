package odwrotnosc;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("podaj 10 liczb");

        int [] liczby= new int[10];
        for(int i=0; i<liczby.length; i++){
            liczby[i]= getScanner().nextInt();        	
        }
        for(int i=liczby.length-1;i>=0;i--)
        {
        	System.out.println(liczby[i]);
        }
	}
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
