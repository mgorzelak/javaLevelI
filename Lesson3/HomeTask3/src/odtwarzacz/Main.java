package odtwarzacz;

import java.util.Scanner;

//int choosenNumber = getScanner().nextInt();
public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("odtarzacz muzyczny");
		// TODO skanery do poprawy
		Scanner typeOfMusicNumber = new Scanner(System.in);
		System.out.println("wybierz gatunek muzyczny");
		System.out.println("1.Rock");
		System.out.println("2.Jezz");
		System.out.println("3.Pop");
		System.out.println("4.Rnb");

		int music = getScanner().nextInt();// TODO skorzystaj z funkcji skanera
											// wrzuc ja od razu switcha
		switch (music) {

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
		// Scanner volumeOfMusicNumber= new Scanner(System.in);
		// .out.println("podaj glosnosc muzyki");

		System.out.println("podaj czy chcesz cicha muzyke -true/false");
		boolean volumeL = getScanner().nextBoolean();

		if (volumeL == true) {
			System.out.println("wybrales cicha muzyke");
		} else {
			System.out.println("wybrales glosna muzyke");
		}

		System.out.println("podaj czy chcesz miec ton niski- true/false");
		boolean toneL = getScanner().nextBoolean();

		System.out.println("podaj czy chcesz miec ton sredni- true/false");
		boolean toneM = getScanner().nextBoolean();
		boolean toneH;

		if (toneL == false && toneM == false) {
			toneH = true;
		} else {
			System.out.println("podaj czy chcesz miec ton wysoki- true/false");
			toneH = getScanner().nextBoolean();
		} 
        String selectedTones="wybrales tony";
        
        if(toneL==true){
        	selectedTones=selectedTones+"niskie";
        }
        if(toneM==true){
        	selectedTones=selectedTones+"srednie";
        }
        if(toneH==true){
        	selectedTones=selectedTones+"wysokie";
        }
        System.out.println(selectedTones);
		// TODO uzyj if i &&

		
		// switch (tone){

		// case 1:
		// System.out.println("Tony niskie");

		// break;
		// case 2:
		// System.out.println("Tony srednie");

		// break;

		// case 3:
		// System.out.println("Tony wysokie");

		// break;

		// }
		Scanner leftSpeaker = new Scanner(System.in);
		System.out.println("wybierz balans dla lewego glosnika od 0 DB do 10 DB (decybeli)");
		double speaker1 = leftSpeaker.nextInt();
		double speaker2 = 10 - speaker1;
		System.out.println("glosnik lewy ma " + speaker1 + " decybeli" + "glosnik prawy ma " + speaker2 + " decybeli");
	}

	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
