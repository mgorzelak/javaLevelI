package pola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("oblicz pole figury");
		
		Scanner inputFigureNumber= new Scanner(System.in);
		System.out.println("wybierz figure");
		System.out.println("1.Prostokat");
		System.out.println("2.Kolo");
		System.out.println("3.Kwadrat");
		System.out.println("4.Trojkat");
		
		int figure= inputFigureNumber.nextInt();
		switch (figure){
		
		case 1:
			System.out.println("prostokat");
			System.out.println("podaj boki figury"); 
			Scanner inputSide1= new Scanner(System.in);
			Scanner inputSide2= new Scanner(System.in);
			int a= inputSide1.nextInt();
			int b= inputSide2.nextInt();
			
			System.out.println("pole prostokata wynosi "+"a*b =  "
					+ ""+(a*b));
			break;
		case 2:
			System.out.println("kolo");
			System.out.println("podaj promien figury");
			Scanner inputRadius= new Scanner(System.in);
			int r= inputRadius.nextInt();
			System.out.println("pole kola wynosi "+"3.14*r*r =  "
					+ ""+(3.14*r*r));
			break;
		case 3:
			System.out.println("kwadrat");
			System.out.println("podaj bok figury");
			Scanner inputSide= new Scanner(System.in);
			int c= inputSide.nextInt();
			System.out.println("pole kwadratu wynosi "+"c*c =  "
					+ ""+(c*c));
			break;
		case 4:
			System.out.println("trojkat");
			System.out.println("podaj bok i wysokosc figury");
			Scanner inputSide4= new Scanner(System.in);
			Scanner inputHigh= new Scanner(System.in);
			int d= inputSide4.nextInt();
			int h= inputHigh.nextInt();
			
			System.out.println("pole trojkata wynosi "+"0.5*d*h =  "
					+ ""+(0.5*d*h));
			break;
		}	

	}

}
