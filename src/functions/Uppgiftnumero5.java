package functions;
import java.util.Scanner;
public class Uppgiftnumero5 {
     // h�r skriver man in ord eller vad som helst
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input string: ");
	        String str = in.nextLine();

	        System.out.print("antal ord: " + count_Words(str)+"\n");
	    }
      //h�r s� r�knar den hur m�nga ord som finns med, fast den r�knar basically bara hur m�nga mellanslag de finns med f�r den funkar inte om man skriver ord utan space
	 public static int count_Words(String str)
	    {
	       int count = 0;
	        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count; 
	    }
	 }
// lite hj�lp h�r ocks� av internet