package by.godev.algorithm.decomposition.task2;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * */

public class DecompositionTask2 {

	public static void main(String[] args) {
		int lcm;
		int a;
		int b;
		int c;
		int d;

		a = 32;
		b = 24;
		c = 16;
		d = 8;

		lcm = greatestCommonFactorOfFour(a, b, c, d);

		System.out.printf("Наибольший общий делитель чисел %d, %d, %d, %d является %d\n", a, b, c, d, lcm);

	}

	public static int greatestCommonFactorOfFour(int a, int b, int c, int d) {
		int mid1;
		int mid2;
		int result;

		mid1 = greatestCommonFactor(a, b);
		mid2 = greatestCommonFactor(c, d);
		result = greatestCommonFactor(mid1, mid2);

		return result;
	}

	public static int greatestCommonFactor(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (greatestCommonFactor(b, a % b));
		}
	}

}
