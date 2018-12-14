package functions;

import java.util.Scanner;

public class Uppgiftnumero2 {
         // här skriver man in 3 nummer 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input num1: ");
		int num1 = in.nextInt();

		System.out.print("Input num2: ");
		int num2 = in.nextInt();

		System.out.print("Input num3: ");
		int num3 = in.nextInt();
         // sen delar koden summan av dom 3 nummrerna till för att få genomsnittet
		System.out.println("genomsnitt av 3 nummer är: " + (num1 + num2 + num3) / 3);
	}

}
