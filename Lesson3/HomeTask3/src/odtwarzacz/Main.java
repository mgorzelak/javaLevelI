package odtwarzacz;

import java.util.Scanner;
//int choosenNumber = getScanner().nextInt();
public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("odtarzacz muzyczny");
		//TODO skanery do poprawy
		Scanner typeOfMusicNumber= new Scanner(System.in);
		System.out.println("wybierz gatunek muzyczny");
		System.out.println("1.Rock");
		System.out.println("2.Jezz");
		System.out.println("3.Pop");
		System.out.println("4.Rnb");
		
		int music= getScanner().nextInt();//TODO skorzystaj z funkcji skanera wrzuc ja od razu switcha
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
		
		System.out.println("podaj czy chcesz cicha muzyke -true/false");
		boolean volumeL= getScanner().nextBoolean();
		

	    if(volumeL==true){
	    	System.out.println("wybrales cicha muzyke");	
	    }
	    else {
	    	System.out.println("wybrales glosna muzyke");	
	    }
	
		
		System.out.println("podaj czy chcesz miec ton niski- true/false");
		boolean toneL= getScanner().nextBoolean();
		
		System.out.println("podaj czy chcesz miec ton sredni- true/false");
		boolean toneM= getScanner().nextBoolean(); 
		
		System.out.println("podaj czy chcesz miec ton wysoki- true/false");
		boolean toneH= getScanner().nextBoolean(); 
		
	     //TODO uzyj if i &&
	    
	    
	    
	    if(toneL==true && toneM==false && toneH==false){
	    	System.out.println("wybrales tylko ton niski");	
	    }
	    else if (toneL==false && toneM==true && toneH==false){
	    	System.out.println("wybrales tylko ton sredni");	
	    }
	    else if (toneL==false && toneM==false && toneH==true){
	    	System.out.println("wybrales tylko ton wysoki");	
	    }
	    else if (toneL==true && toneM==true && toneH==false){
	    	System.out.println("wybrales  tony niski i sredni");	
	    }
	    else if (toneL==true && toneM==false && toneH==true){
	    	System.out.println("wybrales  tony niski i wysoki");	
	    }
	    else if (toneL==false && toneM==true && toneH==true){
	    	System.out.println("wybrales  tony sredni i wysoki");	
	    }
	    
	    else if (toneL==true && toneM==true && toneH==true){
	    	System.out.println("wybrales  tony niski, sredni i wysoki");	
	    }
	    else{
	    	System.out.println("musi byc wybrany przynajmniej jeden ton!!!!");
	    }
	   // switch (tone){
		
	 	//case 1:
		//System.out.println("Tony niskie");
		
		//break;
		//case 2:
		//System.out.println("Tony srednie");
			
		//break;
			
		//case 3:
		//System.out.println("Tony wysokie");
			
		//break;
				
		//}	
		Scanner leftSpeaker= new Scanner(System.in);
		System.out.println("wybierz balans dla lewego glosnika od 0 DB do 10 DB (decybeli)");
		double speaker1= leftSpeaker.nextInt();
		double speaker2=10-speaker1;
		System.out.println("glosnik lewy ma "+speaker1+" decybeli"+"glosnik prawy ma "+speaker2+" decybeli");
	}
	public static Scanner getScanner() {
		if (scanner != null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
