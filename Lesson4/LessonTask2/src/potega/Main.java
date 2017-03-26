package potega;

import java.util.Scanner;


public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("podaj potege n: ");
		int choosenPowerN = getScanner().nextInt();
		
		System.out.println("podaj liczbe ktora chcesz potegowac x: ");
		int choosenNumberX = getScanner().nextInt();
		
	     //int  wynik=1;// przy u¿yciu pêtli
	    //for(int i=0;i<choosenPowerN;i++){
	   // wynik=wynik*choosenNumberX;
	   // System.out.println("liczba x do potegi n wynosi: "+wynik);
	//}
		int potega = (int)Math.pow(choosenNumberX, choosenPowerN);// rozwiazanie za pomoca funkcji matematycznych z biblioteki Math w javie.

        System.out.println(choosenNumberX+" podniesione do potêgi "+choosenPowerN+" wynosi: "+potega);
	    }
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
