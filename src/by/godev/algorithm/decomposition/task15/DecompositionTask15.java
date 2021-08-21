package by.godev.algorithm.decomposition.task15;

import java.util.Scanner;

/*
 * 15.  Найти  все  натуральные n-значные  числа,  цифры  в  которых  образуют  
 * строго  возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию.
 * */

public class DecompositionTask15 {

	public static void main(String[] args) {
		int n;

		System.out.print("Пожалуйста, введите количество знаков: ");
		n = valueFromConsole();

		while (n < 1) {
			System.out.print("Пожалуйста, введите натуральное число больше нуля: ");
			n = valueFromConsole();
		}

		System.out.printf("%d-значные числа образующие строго возрастающую последовательность:\n", n);
		printIncreasingSequence(n);
	}

	public static void printIncreasingSequence(int n) {
		int start;
		int end;

		end = (int) Math.pow(10, n);
		start = (int) Math.pow(10, n - 1);

		for (int i = start; i < end; i++) {
			int[] arr;
			int count = 1;
			arr = numToArray(i);

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] + 1 == (arr[j + 1])) {
					count++;
				}

			}
			if (count == arr.length) {
				System.out.printf("%d, ", i);
			}

		}
		System.out.printf("\n");
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
