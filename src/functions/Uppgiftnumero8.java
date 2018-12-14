package functions;

import java.util.Scanner;

public class Uppgiftnumero8 {
       // h�r skriver man ett nummer sen andelen procent sen skriver man antar �r 
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		    System.out.print("Input investering: ");
		 	double investment = in.nextDouble();
		 	System.out.print("Input rate av investering: ");
			double rate = in.nextDouble();
			System.out.print("Input antal �r: ");
			int year = in.nextInt();
			// h�r skriver den andeln av procent i �ret. man kan r�kna ut v�rdet av n�got som v�xer med ett antal procent varje �r.
			rate *= 0.01;
			
			System.out.println("�r framtida v�rde");
			for(int i = 1; i <= year; i++) {
		    	int formatter = 19;
			    if (i >= 10) formatter = 18;
				System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
		       }
			 }
		 
		 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
				return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
			}
		

	}


