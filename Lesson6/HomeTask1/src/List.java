import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> listaZakupow = new ArrayList<String>();

	public static void main(String[] args) {
		listaZakupow.add(getScanner().nextLine());
		listaZakupow.add("Bartek");
		listaZakupow.add(1, "Z");

		System.out.println(listaZakupow);
		System.out.println(listaZakupow.isEmpty());
		System.out.println(listaZakupow.size());
		System.out.println(listaZakupow.contains("Z"));
		System.out.println(listaZakupow.contains("N"));
		System.out.println(listaZakupow.remove(1));
		listaZakupow.set(1, "Andrzej");
		listaZakupow.clear();
		System.out.println(listaZakupow);

		for (int i = 0; i < listaZakupow.size(); i++) {
			System.out.println(listaZakupow.get(i));
		}

	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

}
