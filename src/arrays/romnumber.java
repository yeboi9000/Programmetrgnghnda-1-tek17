package arrays;

import java.util.Scanner;

public class romnumber {

	public static void main(String[] args) {
		// char[] romNumbers = new Char[7];

		char[] romNumbers = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] valRomNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		// while (true)
		// int sum = 0;
		String input = scanner.nextLine();
		char[] inputCharArray = input.toCharArray();

		for (int i = 0; i < inputCharArray.length; i++) {
			System.out.println(inputCharArray[i]);
			for (int j = 0; j < romNumbers.length; j++) {
				System.out.println(romNumbers[j] + ": i =" + i + " :j = " + j);

				if (inputCharArray[i] == romNumbers[j])
					;
				{
					// System.out.println("True");
					sum += valRomNumbers[j];

				}

			}
			System.out.println("sum= " + sum);

		}

	}
}
