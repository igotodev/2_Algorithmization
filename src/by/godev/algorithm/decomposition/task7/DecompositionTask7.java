package by.godev.algorithm.decomposition.task7;

/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * */

public class DecompositionTask7 {

	public static void main(String[] args) {

		System.out.println(sumOddFactorials(1, 9));
	}

	public static int sumOddFactorials(int start, int end) {
		int sum;

		sum = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum += factorial(i);
			}
		}
		return sum;
	}

	public static int factorial(int a) {
		int factorial;

		factorial = 1;

		for (int i = 1; i <= a; i++) {
			factorial *= i;
		}

		return factorial;
	}

}
