package by.epam.jb24.hw.lesson3_task3;

import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {

		double x = readXfromConsole();
		double rezOfFunction = FunctionCalc(x);
		printResult(rezOfFunction);

	}

	private static void printResult(double rezOfFunction) {
		System.out.println("F(x) = " + rezOfFunction);
	}

	private static double FunctionCalc(double x) {
		double rez = 0;
		if (x <= -3) {
			rez = 9;
		} else if (x > 3) {
			rez = 1 / (Math.pow(x, 2) + 1);
		} else {
			System.out.println("Function is not defined");
		}
		return rez;
	}

	private static double readXfromConsole() {
		double x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");

		x = sc.nextInt();
		return x;
	}

}
