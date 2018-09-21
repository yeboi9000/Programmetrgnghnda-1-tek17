package comparing;

public class Comparing {

	public static void main(String[] args) {
		String romanNumber = "XXXXVVVVVIIIIIIILLLLLLLLL";
		int number = 0;
		
	    for (int index = 0; index <romanNumber.length(); index++ ) {
		System.out.println("index " + index);													
	    if (romanNumber.charAt(index) == 'I') {
	 	    number = number + 1;
	 	}
	 	if (romanNumber.charAt(index) == 'V') {
	 		number = number + 50;
	 	}
	 	if (romanNumber.charAt(index) == 'X') {
		 	number = number + 500;
	 		
	    }
		if (romanNumber.charAt(index) == 'L') {
		 	number = number + 5000;
	 		
	    }
		System.out.println(number); 
        
	    }

	}
}


