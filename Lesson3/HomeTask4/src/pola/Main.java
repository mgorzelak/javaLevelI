package pola;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("oblicz pole figury");

		System.out.println("wybierz figure");
		System.out.println("1.Prostokat");
		System.out.println("2.Kolo");
		System.out.println("3.Kwadrat");
		System.out.println("4.Trojkat");

		int figure = getScanner().nextInt();
		switch (figure) {

		case 1:
			System.out.println("prostokat");
			System.out.println("podaj boki figury");

			int a = getScanner().nextInt();
			int b = getScanner().nextInt();

			System.out.println("pole prostokata wynosi " + "a*b =  " + (a * b));
			break;
		case 2:
			System.out.println("kolo");
			System.out.println("podaj promien figury");

			int r = getScanner().nextInt();
			System.out.println("pole kola wynosi " + "3.14*r*r =  " + (3.14 * r * r));
			break;
		case 3:
			System.out.println("kwadrat");
			System.out.println("podaj bok figury");

			int c = getScanner().nextInt();
			System.out.println("pole kwadratu wynosi " + "c*c =  " + (c * c));
			break;
		case 4:
			System.out.println("trojkat");
			System.out.println("podaj bok i wysokosc figury");

			int d = getScanner().nextInt();
			int h = getScanner().nextInt();

			System.out.println("pole trojkata wynosi " + "0.5*d*h =  " + (0.5 * d * h));
			break;
		}

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
