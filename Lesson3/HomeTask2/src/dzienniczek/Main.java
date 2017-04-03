package dzienniczek;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	private static String surname;
	private static String name;
	private static String school;
	private static int numberOfClass;
	private static String profil;
	private static String extraLessons;
	public static int level;

	public static void main(String[] args) {
		System.out.println("dzienniczek ucznia");
		inputData();

		showData();
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

	public static void inputData() {
		System.out.println("Podaj imie: ");
		name = getScanner().next();

		System.out.println("Podaj nazwisko: ");
		surname = getScanner().next();

		System.out.println("Podaj nazwe szkoly: ");
		school = getScanner().nextLine();

		System.out.println("wybierz poziom edukacji");
		System.out.println("1.Podstawowka");
		System.out.println("2.Gimnazjum");
		level = getScanner().nextInt();

		System.out.println("Podaj nr klasy (1-6 w szko³ach podstawowych, 1-3 w gimnazjach): ");
		numberOfClass = getScanner().nextInt();

		System.out.println("Podaj profil klasy (np. matematyczna, biologiczna, ogólna itd.)");
		profil = getScanner().next();

		System.out.println("czy uczen uczeszcza na dodatkowe zajecia? Wpisz true/false");

		if (getScanner().nextBoolean() == true) {
			System.out.println("Podaj dodatkowe kursy: ");
			extraLessons = getScanner().next();

		}
	}

	public static void showData() {

		System.out.println("imie i nazwisko ucznia :" + name + " " + surname);
		System.out.println("nazwa szkoly :" + school);
		System.out.println("klasa  :" + numberOfClass);
		System.out.println("profil :" + profil);
		if (level == 1) {
			System.out.println("Podstawowka");
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka ");
		} else {
			System.out.println("Gimnazjum");
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka, Chemia i Fizyka ");
		}
		if (extraLessons == null) {
			System.out.println("nie uczeszcza na dodatkowe kursy");
		} else {
			System.out.println("dodatkowe kursy  :" + extraLessons);
		}
	}

}
