package loop;

public class Loop2 {

	public static void main(String[] args) {
		// delar på 3 
				System.out.println("\nDelat på 3: ");		
				for (int i=1; i<100; i++) {
					if (i%3==0) 
					System.out.print(i +", ");			
				}			
						// delar på 5
				System.out.println("\n\nDelat på 5: ");
				for (int i=1; i<100; i++) {
					if (i%5==0) System.out.print(i +", ");			
				}
						// delar på 3 och 5
				System.out.println("\n\nDelat på 3 & 5: ");			
				for (int i=1; i<100; i++) {
					if (i%3==0 && i%5==0) System.out.print(i +", ");			
				}
				System.out.println("\n");
		  }     // gör en ny linje
		

	}


