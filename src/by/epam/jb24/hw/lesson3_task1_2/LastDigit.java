package by.epam.jb24.hw.lesson3_task1_2;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {

		int x = readXFromConsole();
		int LastNumber = calcLastNumber(x);
		printResult(LastNumber);

	}

	
	private static int readXFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.print("Enter the number: ");
		x = sc.nextInt();
		return x;
	}

	private static int calcLastNumber (int number) {

		int poslZifra = 0;
		int poslZifraKv = 0;

		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Something goes wrong... ");
			break;
		}
		return poslZifraKv;
	}

	public static void printResult(int x) {
		System.out.println("The last digit of the number square = " + x);
	}

}
