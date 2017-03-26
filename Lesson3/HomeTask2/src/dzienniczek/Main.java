package dzienniczek;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("dzienniczek ucznia");

		System.out.println("Podaj imie: ");
		String name = getScanner().next();

		System.out.println("Podaj nazwisko: ");
		String surname = getScanner().next();
		scanner.nextLine();
		System.out.println("Podaj nazwe szkoly: ");
		String school = getScanner().nextLine();

		Scanner levelOfEducation = new Scanner(System.in);
		System.out.println("wybierz poziom edukacji");

		System.out.println("1.Podstawowka");
		System.out.println("2.Gimnazjum");

		int level = getScanner().nextInt();
		switch (level) {

		case 1:
			System.out.println("Podstawowka");

			break;
		case 2:
			System.out.println("Gimnazjum");

			break;

		}
		System.out.println("Podaj nr klasy (1-6 w szko³ach podstawowych, 1-3 w gimnazjach): ");
		int numberOfClass = getScanner().nextInt();

		System.out.println("Podaj profil klasy (np. matematyczna, biologiczna, ogólna itd.)");
		String profil = getScanner().next();

		System.out.println("imie i nazwisko ucznia " + name + " " + surname);
		System.out.println("nazwa szkoly " + school);
		System.out.println("klasa  " + numberOfClass);
		System.out.println("profil " + profil);
		if (level == 1) {
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka ");

		} else {
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka, Chemia i Fizyka ");
		}
		System.out.println("czy uczen uczeszcza na dodatkowe zajecia? Wpisz 1- tak, 0 -nie");

		if (getScanner().nextBoolean() == true) {
			System.out.println("Podaj dodatkowe kursy: ");
			String extraLessons = scanner.next();
		}
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
