package functions;

import java.util.Scanner;

public class Uppgift1metoder {

	public static void main(String[] args) {

		largestAmongThree(input());

	}

	public static int[] inputs() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("Input First Number:");
		inputs[0] = scanner.nextInt();
		System.out.println("Input Second Number:");
		inputs[1] = scanner.nextInt();
		System.out.println("Input Third Number:");
		inputs[2] = scanner.nextInt();
		return inputs;
	}

	public static void largestAmongThree(int[] inputs) {
		int tempvar;
		if (inputs[0] > inputs[1]) {
			tempvar = inputs[0];

		} else {
			tempvar = inputs[1];

		}
		if (tempvar > inputs[2]) {
			System.out.println(tempvar);

		} else {
			System.out.println(inputs[2]);

		}

		smallestAmongThree(input());

	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[3];
		System.out.println("Input First Number:");
		input[0] = scanner.nextInt();
		System.out.println("Input Second Number:");
		input[1] = scanner.nextInt();
		System.out.println("Input Third Number:");
		input[2] = scanner.nextInt();
		return input;
	}

	public static void smallestAmongThree(int[] input) {
		int tempvar;
		if (input[0] < input[1]) {
			tempvar = input[0];

		} else {
			tempvar = input[1];

		}
		if (tempvar < input[2]) {
			System.out.println(tempvar);

		} else {
			System.out.println(input[2]);

		}
	}
}