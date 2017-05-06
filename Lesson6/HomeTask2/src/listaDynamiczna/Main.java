package listaDynamiczna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> listaDynamiczna = new ArrayList<String>();

	public static void main(String[] args) {

		System.out.println("podaj ile elementów bêdzie liczy³a lista");

		int a = getScanner().nextInt();

		System.out.println("lista bedzie liczyla: " + a + " elementow");

		System.out.println("podaj te elementy");
		
		LinkedList<String> listaDynamiczna = new LinkedList<String>();

		for (int i = 0; i <a; i++) {
			listaDynamiczna.add(getScanner().nextLine());
		}
		System.out.println("elementy listy to: "+listaDynamiczna);
		System.out.println("masz mozliwosc wyboru elementu z listy, który ma zostaæ usuniêty");
		System.out.println(listaDynamiczna.remove(getScanner().nextLine()));
		System.out.println("elementy listy to: "+listaDynamiczna);
		System.out.println("masz mozliwosc wstawienia w wybrane miejsce nowego elementu, podaj numer elementu w liscie");
		int b = getScanner().nextInt();
		listaDynamiczna.add(b,"nowy element");
		System.out.println("elementy listy to: "+listaDynamiczna);
		listaDynamiczna.set(1, "podmiana na inny element");
		System.out.println("elementy listy to: "+listaDynamiczna);
		
		System.out.println("rozmiar listy wynosi: "+listaDynamiczna.size());
		
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
