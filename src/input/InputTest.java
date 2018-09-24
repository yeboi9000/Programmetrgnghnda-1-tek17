package input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in); 
         
		System.out.print("Enter name: ");
         
          inputScanner.nextLine();
          
          String name = inputScanner.nextLine();
         
          System.out.println("Hello" + name);
          
          System.out.print("Enter your age: ");
          
          int age = inputScanner.nextInt();
          
          if (age > 120) {
        	  System.out.println("You lying piece of shit!!!!");
        	  System.exit(0); 
          } else if(age < 5) {
        	System.out.println("You must be older!");
          System.exit(0);
          } else {
          System.out.println("So your age is:" + age);
          }
          
         
          System.out.println("Enter your weight: ");
          double weight = inputScanner.nextDouble();
          if (weight > 100) {
          System.out.println("fattyboi"); 
          } else if(weight < 50) {
        	  System.out.println("Skinnyboi");
          }
          System.out.println("So your weight is:" + weight);
          
          
        
	}
	

}
