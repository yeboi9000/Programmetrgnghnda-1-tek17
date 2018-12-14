package functions;

import java.util.Scanner;

public class Uppgiftnumero10 {
  //här skriver man in ett år 
	public static void main(String[] args) {
		  {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input a year: ");
		        int year = in.nextInt();
  // sen svarar den här ifall det året var ett skottår 
		        System.out.println(is_LeapYear(year)); }
	}
    // här finns boolean för att visa om det är sant eller falskt t.ex att 2016 är skottår då visar den true
	public static boolean is_LeapYear(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y % 100 == 0) && (y % 400 == 0));

		return a && (b || c);
	
	
	
	
}
}
