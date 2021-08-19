package by.godev.algorithm.decomposition.task13;

import java.util.Scanner;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.  
 * Для решения задачи использовать декомпозицию.
 * */

public class DecompositionTask13 {

	public static void main(String[] args) {
		int n;
		int end;

		System.out.print("Пожалуйста, введите начало отрезка: ");
		n = valueFromConsole();
		while (n <= 2) {
			System.out.print("Пожалуйста, введите целое число больше 2: ");
			n = valueFromConsole();
		}
		end = 2 * n;

		printArray(pairsTwins(n, end));

	}

	public static int[] pairsTwins(int start, int end) {
		int[] arr;
		int count;

		arr = new int[(end - start + 2) / 2];
		count = 0;

		for (int i = start; i <= end; i = i + 2) {
			arr[count] = i;
			count++;
		}
		return arr;
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

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d, ", arr[i]);
		}
	}

}
