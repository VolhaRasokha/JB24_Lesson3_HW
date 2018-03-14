package by.epam.jb24.hw.lesson3_task1_4;

import java.util.Scanner;

public class Line01 {

	public static void main(String[] args) {

		int x = readXFromConsole();
		boolean num = lookingForNumber(x);
		printResult(num);

	}

	private static void printResult(boolean num) {
		if (num) {
			System.out.println("The number has even number");
		} else {
			System.out.println("The number hasn't even number");
		}
	}

	private static boolean lookingForNumber(int number) {
		int digit = 0;
		boolean result = false;

		while (number != 0) {
			digit = number % 10;
			number = number / 10;

			if (digit % 2 == 0) {
				result = true;
				break;
			}
		}
		return result;
	}

	private static int readXFromConsole() {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		x = sc.nextInt();
		return x;
	}

}