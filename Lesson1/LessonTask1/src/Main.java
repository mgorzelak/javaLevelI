import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int age;
	
	public static final int NUMBER_OF_PLANETS = 10;
	
	public static void main(String[] args) {

		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
//
//		int userNumber;
//		int generatedNumber;
//		System.out.println();
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		System.out.println("Wprowadz liczbe: ");
//		userNumber = scan.nextInt();
//
//		age =15;  
//		
//		int numberOfTry = 0;
//		do {
//			numberOfTry++;
//			generatedNumber = generator.nextInt(30);
//			System.out.println("Wylosowales liczbe " + generatedNumber + " w losowaniu " + numberOfTry);
//		} while (userNumber != generatedNumber);
//		
//		calculate();
		
		System.out.println(generator.nextBoolean());
		System.out.println(generator.nextInt());
		System.out.println(generator.nextInt(25));
		System.out.println(generator.nextInt(25));
		System.out.println(generator.nextDouble()* 50);
		
	}

	public static int calculate(){
		
		return 0;
	}
	
}
