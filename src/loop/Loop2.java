package loop;

public class Loop2 {

	public static void main(String[] args) {
		// delar p� 3 
				System.out.println("\nDelat p� 3: ");		
				for (int i=1; i<100; i++) {
					if (i%3==0) 
					System.out.print(i +", ");			
				}			
						// delar p� 5
				System.out.println("\n\nDelat p� 5: ");
				for (int i=1; i<100; i++) {
					if (i%5==0) System.out.print(i +", ");			
				}
						// delar p� 3 och 5
				System.out.println("\n\nDelat p� 3 & 5: ");			
				for (int i=1; i<100; i++) {
					if (i%3==0 && i%5==0) System.out.print(i +", ");			
				}
				System.out.println("\n");
		  }     // g�r en ny linje
		

	}


