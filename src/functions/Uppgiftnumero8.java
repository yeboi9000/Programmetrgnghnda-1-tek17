package functions;

import java.util.Scanner;

public class Uppgiftnumero8 {
       // här skriver man ett nummer sen andelen procent sen skriver man antar år 
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		    System.out.print("Input investering: ");
		 	double investment = in.nextDouble();
		 	System.out.print("Input rate av investering: ");
			double rate = in.nextDouble();
			System.out.print("Input antal år: ");
			int year = in.nextInt();
			// här skriver den andeln av procent i året. man kan räkna ut värdet av något som växer med ett antal procent varje år.
			rate *= 0.01;
			
			System.out.println("år framtida värde");
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


