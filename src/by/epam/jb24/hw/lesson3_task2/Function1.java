package by.epam.jb24.hw.lesson3_task2;

public class Function1 {
	public static void main(String[] ards) {
		double a = 0; // beginning of the line
		double b = 6; // end of the line
		double h = 0.5; // step

		printResult(a, b, h);
	}

	// Method for result printing
	private static void printResult(double a, double b, double h) {
		System.out.println("-----------------------------------");
		System.out.println("| " + " x " + " | Result of function ");
		System.out.println("-----------------------------------");
		for (double i = a; i <= b; i = i + h) {
			double rez = CalcOfFunction(i);
			System.out.println("| " + i + " | " + rez);
			System.out.println("-----------------------------------");
		}

	}

	// Method of Function calculation
	private static double CalcOfFunction(double x) {
		return 2 * Math.tan(x / 2) + 1;
	}

}