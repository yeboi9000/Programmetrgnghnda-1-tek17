package functions;

import java.util.Scanner;

public class Uppgiftnumero3 {

	public static void main(String[] args) {
		      // här skriver man in något ord 
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input string: ");
		        String str = in.nextLine();
		        System.out.print(" input mellan bokstäverna: " + middle(str)+"\n");
		    }
		 public static String middle(String str)
		    {     // den här delen tog jag hjälp av internet för att få den att fungera förstår inte riktigt vad som händer här
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
		
// tog hjälp av internet på denna vid vissa delar
	

}
