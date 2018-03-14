package by.epam.jb24.hw.lesson3_task1_1;

import java.util.Scanner;

public class MinMaxString {
	public static void main(String[] args) {

		String[] str = readFromConsole();
		String[] minMaxStr = MinMaxStrCalc(str);
		printResult(minMaxStr);
	}

	private static void printResult(String[] minMaxStr) {
		System.out.println("max string = " + minMaxStr[1] + " length=" + minMaxStr[1].length());
		System.out.println("min string = " + minMaxStr[0] + " length=" + minMaxStr[0].length());
	}

	private static String[] MinMaxStrCalc(String[] str) {
		String max = "", min = "";
		for (int i = 0; i < str.length; i++) {
			if (i == 0) {
				min = str[i];
				max = str[i];
			}
			if (str[i].length() > max.length()) {
				max = str[i];
			} else if (str[i].length() < min.length()) {
				min = str[i];
			}
		}
		return new String[] { min, max };
	}

	private static String[] readFromConsole() {
		int n = 4;
		String[] mas;
		mas = new String[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				mas[i] = sc.nextLine();

			}
		}
		return mas;
	}
}