package functions;
import java.util.Scanner;
public class Uppgiftnumero5 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input string: ");
	        String str = in.nextLine();

	        System.out.print("antal ord: " + count_Words(str)+"\n");
	    }

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