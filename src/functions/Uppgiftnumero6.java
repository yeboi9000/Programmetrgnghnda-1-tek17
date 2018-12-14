package functions;

import java.util.Scanner;

public class Uppgiftnumero6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input integer: ");
		int digits = in.nextInt();
		System.out.println("summa är " + sumDigits(digits));
	}

	public static int sumDigits(long n) {
		int result = 0;

		while (n > 0) {
			result += n % 10;
			n /= 10;
		}

		return result;
	}

}
// fick info om denna på stackoverflow fattar inte riktigt hur denna fungerar men den fungerade engligt deras info