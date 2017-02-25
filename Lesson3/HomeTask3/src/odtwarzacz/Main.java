package odtwarzacz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("odtarzacz muzyczny");

		Scanner typeOfMusicNumber= new Scanner(System.in);
		System.out.println("wybierz gatunek muzyczny");
		System.out.println("1.Rock");
		System.out.println("2.Jezz");
		System.out.println("3.Pop");
		System.out.println("4.Rnb");
		
		int music= typeOfMusicNumber.nextInt();
		switch (music){
		
		case 1:
			System.out.println("Rock");
			
			break;
		case 2:
			System.out.println("Jezz");
			
			break;
		case 3:
			System.out.println("Pop");
			
			break;
		case 4:
			System.out.println("Rnb");
			
			break;
	}
		Scanner volumeOfMusicNumber= new Scanner(System.in);
		System.out.println("podaj glosnosc muzyki");
		System.out.println("1.Glosno");
		System.out.println("2.Cicho");
		int volume= volumeOfMusicNumber.nextInt();
		switch (volume){
		
		case 1:
			System.out.println("Glosno");
			
			break;
		case 2:
			System.out.println("Cicho");
			
			break;
		}
		Scanner toneOfMusicNumber= new Scanner(System.in);
		System.out.println("wybierz ton");
		
		System.out.println("1.Tony niskie");
		System.out.println("2.Tony srednie");
		System.out.println("3.Tony wysokie");
		int tone= toneOfMusicNumber.nextInt();
		switch (tone){
		
		case 1:
			System.out.println("Tony niskie");
			
			break;
		case 2:
			System.out.println("Tony srednie");
			
			break;
			
		case 3:
			System.out.println("Tony wysokie");
			
			break;
			
			
		}
		Scanner leftSpeaker= new Scanner(System.in);
		System.out.println("wybierz balans dla lewego glosnika od 0 DB do 10 DB (decybeli)");
		double speaker1= leftSpeaker.nextInt();
		double speaker2=10-speaker1;
		System.out.println("glosnik lewy ma "+speaker1+" decybeli"+"glosnik prawy ma "+speaker2+" decybeli");
	}
}
