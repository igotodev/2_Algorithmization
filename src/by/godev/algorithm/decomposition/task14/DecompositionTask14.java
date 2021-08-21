package by.godev.algorithm.decomposition.task14;

/*
 * 14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  
 * если  сумма  его  цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
 * Для решения задачи использовать декомпозицию.
 * */

public class DecompositionTask14 {

	public static void main(String[] args) {
		int k;

		k = 95000;

		System.out.printf("Числа Армстронга от 1 до %d: \n", k);
		printArrayWithoutZeros(findArmstrongNumbers(k));

	}

	public static int[] findArmstrongNumbers(int k) {
		int[] result;
		int count;
		int max;

		result = new int[25];
		max = 10000000;
		if (k > max) {
			System.out.printf("Установлено максимальное значение в %d\n" + "Придется немного подождать...\n", max);
			k = max;
		}
		count = 0;

		for (int i = 0; i <= k; i++) {
			int lenArr;
			int[] arr;
			int mid;

			mid = 0;
			arr = numToArray(i);
			lenArr = 0;

			for (int j = 0; j < arr.length; j++) {
				mid += (int) Math.pow(arr[j], countDigits(i));
				lenArr++;
				if (lenArr == arr.length && mid == i) {
					result[count] = i;
					count++;
				}
			}

		}
		return result;
	}

	public static int[] numToArray(int n) {
		int count;
		int[] arr;

		count = countDigits(n);
		arr = new int[count];

		while (n > 0) {
			arr[count - 1] = n % 10;
			n = (n - (n % 10)) / 10;
			count--;
		}

		return arr;
	}

	public static int countDigits(int n) {
		int count;

		count = 0;

		while (n > 0) {
			n = (n - (n % 10)) / 10;
			count++;
		}
		return count;
	}

	public static void printArrayWithoutZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.printf("%d, ", arr[i]);
			}
		}
	}

}
