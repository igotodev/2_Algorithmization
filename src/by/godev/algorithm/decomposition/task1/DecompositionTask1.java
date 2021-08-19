package by.godev.algorithm.decomposition.task1;

/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух натуральных чисел: НОК(A, B) = (A * B) / НОД(A, B)
 * */

public class DecompositionTask1 {

	public static void main(String[] args) {
		int a;
		int b;

		a = 4;
		b = 16;

		System.out.printf("Наименьшее общее кратное чисел %d и %d равно %d\n", a, b, leastCommonMultiple(a, b));

		System.out.printf("Наибольший общий делитель чисел %d и %d равен %d\n", a, b, greatestCommonFactor(a, b));

	}

	public static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonFactor(a, b);
	}

	public static int greatestCommonFactor(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (greatestCommonFactor(b, a % b));
		}
	}

}
