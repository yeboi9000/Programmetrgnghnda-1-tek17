package functions;

import java.util.Scanner;

public class Uppgiftnumero3 {

	public static void main(String[] args) {
		      // h�r skriver man in n�got ord 
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input string: ");
		        String str = in.nextLine();
		        System.out.print(" input mellan bokst�verna: " + middle(str)+"\n");
		    }
		 public static String middle(String str)
		    {     // den h�r delen tog jag hj�lp av internet f�r att f� den att fungera f�rst�r inte riktigt vad som h�nder h�r
		        int position;
		        int length;
		        if (str.length() % 2 == 0)
		        {
		            position = str.length() / 2 - 1;
		            length = 2;
		        }
		        else
		        {
		            position = str.length() / 2;
		            length = 1;
		        }
		        return str.substring(position, position + length);
		    }
		
// tog hj�lp av internet p� denna vid vissa delar
	

}
