package by.epam.jb24.hw.lesson3_task1_3;

import java.util.Scanner;

public class ColDays {

	public static void main(String[] args) {

		System.out.println("Enter the Year: ");
		int year = readXFromConsole();

		System.out.println("Enter the Month: ");
		int month = readXFromConsole();

		int day = calcDay(year, month);

		printResult(day);

	}

	private static void printResult(int day) {
		System.out.println("Number of days is " + day);

	}

	private static int calcDay(int year, int month) {
		int col_day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		return col_day;
	}

	private static int readXFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

}
