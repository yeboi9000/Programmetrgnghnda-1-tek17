package functions;

import java.util.Scanner;

public class Uppgiftnumero4 {
 // h�r skriver man in ett ord 
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input string: ");
	        String str = in.nextLine();

	        System.out.print("nummer av vokalen i string: " + count_Vowels(str)+"\n");
	    }
	 public static int count_Vowels(String str)
	    {   // h�r r�knar den vilka vokaler som finns i ordet som man ser nere i if satsen med str.charAt
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	
// tog hj�lp p� denna ocks� vid vissa delar typ vowels osv
	}


