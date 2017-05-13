package listaDynamiczna;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> dynamicList = new ArrayList<String>();
	public static ArrayList<Integer> dynamicIntegerList = new ArrayList<Integer>();

	public static void main(String[] args) {

		System.out.println("podaj ile elementów bêdzie liczy³a lista");
		int a = getScanner().nextInt();
		System.out.println("lista bedzie liczyla: " + a + " elementow");
		System.out.println("podaj te elementy");
		for (int i = 0; i < a; i++) {
			dynamicList.add(getScanner().nextLine());
		}
		showMenu();
	}

	public static void showMenu() {
		for (;;) {
			System.out.println("Menu");
			System.out.println("1.  Wybierz element z listy, ktory ma zostaæ usuniety");
			System.out.println("2.  Wstaw w wybrane miejsce nowy element");
			System.out.println("3.  Podmien wartosc wybranego elementu");
			System.out.println("4.  Wyswietl aktualny rozmiar listy");
			System.out.println("5.  Wyswietl liste");
			System.out.println();
			System.out.println("wybierz pozycje");
			switch (getScanner().nextInt()) {
			case 1:
				removeElementsOfDynamicList();
				break;
			case 2:
				addNewElementSomewhere();
				break;
			case 3:
				changeElement();
				break;
			case 4:
				System.out.println("rozmiar listy wynosi: " + dynamicList.size());
				break;

			case 5:
				System.out.println("elementy listy to: " + dynamicList);
				break;
			default:
				System.out.println("Brak takiej pozycji w menu");
				break;

			}
			clearConsole();
		}
	}

	public static void clearConsole() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

	public static void addNewElementSomewhere() {
		if (dynamicList.isEmpty() == false) {
			System.out.println("podaj,w ktore miejsce chcesz dodac nowy element oraz nazwe tego elementu");
			int e = getScanner().nextInt();
			if (dynamicList.size() > e) {
				dynamicList.add(e, getScanner().next());

			} else {
				System.out.println("nie ma takiego elementu");
			}
		} else {
			System.out.println("lista jest pusta");
		}

	}

	public static void removeElementsOfDynamicList() {

		System.out.println("rozmiar listy wynosi  " + dynamicList.size());
		if (dynamicList.isEmpty() == false) {
			System.out.println("podaj numer elementu, ktory chcesz usunac");
			int c = getScanner().nextInt();

			if (dynamicList.size() > c) {
				dynamicList.remove(c);

			} else {
				System.out.println("nie ma elementu o takim numerze");
			}
		} else {
			System.out.println("lista jest pusta");
		}
	}

	public static void changeElement() {
		if (dynamicList.isEmpty() == false) {
			System.out.println("podaj numer elementu, ktory chcesz podmienic a takze na jaki element chcesz podmienic");
			int f = getScanner().nextInt();
			if (dynamicList.size() > f) {
				dynamicList.set(f, getScanner().next());
			} else {
				System.out.println("brak takiego numeru elementu");
			}
		} else {
			System.out.println("lista jest pusta");
		}
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
