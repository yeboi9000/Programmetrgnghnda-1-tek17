package loop;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number:");
		double number1 = scanner.nextDouble();
			System.out.print("Enter a number:");
		double number2 = scanner.nextDouble();		
		
		System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
		
		System.out.println();
		
		if (number1 == 0 && number2 ==0) {
		break;
		}

	}
		
	}
}


