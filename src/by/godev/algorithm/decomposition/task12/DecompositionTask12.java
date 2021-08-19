package by.godev.algorithm.decomposition.task12;

/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 * */

public class DecompositionTask12 {

	public static void main(String[] args) {
		int[] arr;
		int k;
		int n;

		k = 5;
		n = 1000;

		arr = createArray(k, n, 10);
		printArray(arr);

	}

	public static int[] createArray(int k, int n, int len) {
		int[] arr;
		int count;

		arr = new int[len];
		count = 0;

		for (int i = 0; i < len; i++) {
			int mid = 0;
			for (int j = mid; j < n; j++) {
				if (sumDigits(j) == k && count < len) {
					arr[count] = j;
					mid = j;
					count++;
				}
			}
		}
		return arr;
	}

	public static int sumDigits(int n) {
		int sum;

		sum = 0;

		while (n > 0) {
			sum += (n % 10);
			n = (n - (n % 10)) / 10;
		}
		return sum;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d, ", arr[i]);
		}
	}

}
