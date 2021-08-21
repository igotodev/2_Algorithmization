package by.godev.algorithm.decomposition.task16;

import java.util.Scanner;

/*
 * 16.  Написать  программу,  определяющую  сумму n-значных  чисел,  содержащих  только  нечетные  цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * */

public class DecompositionTask16 {

	public static void main(String[] args) {
		int n;
		int sumOdd;
		int countEven;

		System.out.print("Пожалуйста, введите количество знаков: ");
		n = valueFromConsole();
		while (n < 1) {
			System.out.print("Пожалуйста, введите натуральное число больше нуля: ");
			n = valueFromConsole();
		}

		sumOdd = sumOddNumbers(n);
		countEven = countEvenNumbers(sumOdd);

		System.out.printf("Сумма %d-значных чисел, содержащих только нечетные цифры, равна %d\n"
				+ "В сумме содержится %d четная(ые) цифра(ы)\n", n, sumOdd, countEven);
	}

	public static int countEvenNumbers(int n) {
		int[] arr;
		int count;

		arr = numToArray(n);
		count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	public static int sumOddNumbers(int n) {
		int start;
		int end;
		int sum;

		end = (int) Math.pow(10, n);
		start = (int) Math.pow(10, n - 1);
		sum = 0;

		for (int i = start; i < end; i++) {
			int[] arr;
			int count = 0;
			arr = numToArray(i);

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 2 != 0) {
					count++;
				}

			}
			if (count == arr.length) {
				// System.out.printf("%d, ", i);
				sum += i;
			}

		}
		// System.out.printf("\n");
		return sum;
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

	public static int valueFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int value;

		while (!scan.hasNextInt()) {
			System.out.print("Пожалуйста, введите целое число: ");
			scan.next();
		}
		value = scan.nextInt();

		return value;
	}

}
