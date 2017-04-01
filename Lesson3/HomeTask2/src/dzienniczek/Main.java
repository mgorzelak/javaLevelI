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

	public static void main(String[] args) {
		System.out.println("dzienniczek ucznia");
	    inputData();
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
		default:
			System.out.println("brak tej pozycji w menu");
			break;
		}
		System.out.println("Podaj nr klasy (1-6 w szko³ach podstawowych, 1-3 w gimnazjach): ");
		setNumberOfClass(getScanner().nextInt());

		System.out.println("Podaj profil klasy (np. matematyczna, biologiczna, ogólna itd.)");
		setProfil(getScanner().next());

		if (level == 1) {
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka ");

		} else {
			System.out.println("przedmioty: WF, Jêzyk Polski, Matematyka, Chemia i Fizyka ");
		}
		System.out.println("czy uczen uczeszcza na dodatkowe zajecia? Wpisz true/false");

		if (getScanner().nextBoolean() == true) {
			System.out.println("Podaj dodatkowe kursy: ");
		    String extraLessons = getScanner().next();
			System.out.println("Dodatkowe kursy to: " + extraLessons);
		}
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
	}


	public static void showData() {
		
		System.out.println("imie i nazwisko ucznia :" + name + " " + surname);
		System.out.println("nazwa szkoly :" + school);
		System.out.println("klasa  :" + numberOfClass);
		System.out.println("profil :" + profil);
		System.out.println("dodatkowe kursy  :" + extraLessons);
	}

	public static int getNumberOfClass() {
		return numberOfClass;
	}

	public static void setNumberOfClass(int numberOfClass) {
		Main.numberOfClass = numberOfClass;
	}

	public static String getProfil() {
		return profil;
	}
	public static String getExtraLessons() {
		return extraLessons;
	}

	public static void setProfil(String profil) {
		Main.profil = profil;
	}
}
