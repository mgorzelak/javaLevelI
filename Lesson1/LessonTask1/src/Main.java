import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random generator = new Random();
		Scanner scan = new Scanner(System.in);

		int userNumber;
		int generatedNumber;
		System.out.println("Wprowadz liczbe: ");
		userNumber = scan.nextInt();

		int numberOfTry = 0;
		do {
			numberOfTry++;
			generatedNumber = generator.nextInt(30);
			System.out.println("Wylosowales liczbe " + generatedNumber + " w losowaniu " + numberOfTry);
		} while (userNumber != generatedNumber);
		

	}

}
