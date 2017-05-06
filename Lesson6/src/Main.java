import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> listaZakupow = new ArrayList<String>();
	public static Random generator = new Random();

	public static void main(String[] args) {

		System.out.println("wprowadz nazwy produktów, które zamierzasz kupiæ  ");
		listaZakupow.add(getScanner().nextLine());

		System.out.println("jesli chcesz to, dodaj pozycje do listy ");
		listaZakupow.add(getScanner().nextLine());
		System.out.println(listaZakupow);
		System.out.println("jesli chcesz to, odejmij pozycje z listy ");
		System.out.println(listaZakupow.remove(getScanner().nextLine()));
		System.out.println(listaZakupow);
		if (listaZakupow.size() > 10) {
			System.out.println("lista powyzej 10 produktow, podsumujmy zakupy! ");
			LinkedList listaZakupow = new LinkedList();
			Random generator = new Random();

			for (int i = 0; i < 11; i++) {

				listaZakupow.add(generator.nextInt(25));
				System.out.println(listaZakupow);

			}
			// for (int i = 0; i < listaZakupow.size(); i++) {

			// i = generator.nextInt(25);
			// listaZakupow.get(i);
			// }
			System.out.println(listaZakupow);
		} else {
			System.out.println("dopisz produkt(y)aby bylo min 10 ");
			listaZakupow.add(getScanner().nextLine());
			System.out.println(listaZakupow);
			LinkedList listaZakupow = new LinkedList();
			Random generator = new Random();

			for (int i = 0; i < 10; i++) {

				listaZakupow.add(generator.nextInt(25) + 1);

			}
			System.out.println(listaZakupow + "zl");

			int e1 = (int) listaZakupow.get(0);
			int e2 = (int) listaZakupow.get(1);
			int e3 = (int) listaZakupow.get(2);
			int e4 = (int) listaZakupow.get(3);
			int e5 = (int) listaZakupow.get(4);
			int e6 = (int) listaZakupow.get(5);
			int e7 = (int) listaZakupow.get(6);
			int e8 = (int) listaZakupow.get(7);
			int e9 = (int) listaZakupow.get(8);
			int e10 = (int) listaZakupow.get(9);
			int sum = e1 + e2 + e3 + e4 + e5 + e6 + e7 + e8 + e9 + e10;
			System.out.println("do zaplaty: " + sum + " zlotych");
		}

		// do {
		// System.out.println(listaZakupow);

		// } while (listaZakupow.size() > 11);
		// {
		// System.out.println("lista powyzej 10 produktow, podsumujmy zakupy!
		// ");

		//

		// }
		// listaZakupow.add("ser");
		// listaZakupow.add(1, "Z");

		// System.out.println(listaZakupow);
		// System.out.println(listaZakupow.isEmpty());
		// System.out.println(listaZakupow.size());
		// System.out.println(listaZakupow.contains("Z"));
		// System.out.println(listaZakupow.contains("N"));

		// listaZakupow.set(1, "Andrzej");
		// listaZakupow.clear();
		// System.out.println(listaZakupow);

		// for (int i = 0; i < listaZakupow.size(); i++) {
		// System.out.println(listaZakupow.get(i));
		// }

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
