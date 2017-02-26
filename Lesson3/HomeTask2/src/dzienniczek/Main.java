package dzienniczek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("dzienniczek ucznia");
	Scanner scanner = new Scanner(System.in);

	System.out.println("Podaj imie: ");
	String name = scanner.next();

	System.out.println("Podaj nazwisko: ");
	String surname = scanner.next();
	
	System.out.println("Podaj nazwe szkoly: ");
	String school = scanner.next();
	
	Scanner levelOfEducation= new Scanner(System.in);
	System.out.println("wybierz poziom edukacji");
	
	System.out.println("1.Podstawowka");
	System.out.println("2.Gimnazjum");
	
	int level= levelOfEducation.nextInt();
	switch (level){
	
	case 1:
		System.out.println("Podstawowka");
		
		break;
	case 2:
		System.out.println("Gimnazjum");
		
		break;
		
	
		
		
	}
	System.out.println("Podaj nr klasy (1-6 w szko³ach podstawowych, 1-3 w gimnazjach): ");
	int numberOfClass = scanner.nextInt();

	System.out.println("Podaj profil klasy (np. matematyczna, biologiczna, ogólna itd.)");
	String profil = scanner.next();
	
	System.out.println("imie i nazwisko ucznia " + name +" "+  surname);
	System.out.println("nazwa szkoly " + school);
	System.out.println("klasa  " + numberOfClass);
	System.out.println("profil " + profil);
	if(level==1){
		System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka ");
		
	}
	else{
		System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka, Chemia i Fizyka ");
	}
	System.out.println("czy uczen uczeszcza na dodatkowe zajecia? Wpisz 1- tak, 0 -nie");
	boolean extra = scanner.nextBoolean();
	//if(extra==true){
	//	System.out.println("Podaj dodatkowe kursy: ");
	//	String extra = scanner.next();
	//}
}
}
