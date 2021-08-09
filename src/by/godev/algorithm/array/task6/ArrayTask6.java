package by.godev.algorithm.array.task6;

/*
 * 6. Задана последовательность N  вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 * */

public class ArrayTask6 {

	public static void main(String[] args) {
		double[] arr;
		double sum;

		sum = 0;
		// arr = new double[] {232,22,45,74,786,90,34,20,99};
		arr = new double[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(i)) {
				sum += arr[i];
				// System.out.println(i + " " + arr[i]);
			}
		}

		System.out.println(sum);

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
