package inputoutput;
import java.util.Scanner;

public class Input7 {
    
	public static void main(String[] args) {
		int x = 1, y = 0, temp;
		Scanner in = new Scanner(System.in);
		 in.nextInt();
	     in.nextInt();

	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	     
	      temp = x;
	      x = y;
	      y = temp;
	     
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
		
		
		
		
	}

}
