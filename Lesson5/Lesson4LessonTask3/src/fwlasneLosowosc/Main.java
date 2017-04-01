package fwlasneLosowosc;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static int choosenNumber;
	public static void main(String[] args) {
		
		provideNumber();
		int nrTrialas=0;
		System.out.println("losowana jest liczba równie¿ z tego samego zakresu");
	    int randomInt;
		do
	    {
	        nrTrialas++;
	    	Random randomGenerator = new Random();
	        randomInt = randomGenerator.nextInt(30)+1;
			
	        System.out.println(randomInt); 
	        System.out.println("wypadla liczba: "+ randomInt+ " w probie "+nrTrialas);
	        

	    }while (randomInt!=choosenNumber);
		System.out.println("potrzebowalismy "+ nrTrialas+ " prob(y) zeby otrzymac wprowadzona liczbe: "+choosenNumber);
	         
	}
	public static void provideNumber() {
		System.out.println("wybierz liczbe od 1 do 30");
		 choosenNumber=getScanner().nextInt();
		
	}
	
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
	
	
}
