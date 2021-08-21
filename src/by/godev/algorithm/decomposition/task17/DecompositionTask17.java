package by.godev.algorithm.decomposition.task17;

import java.util.Scanner;

/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 * */

public class DecompositionTask17 {

	public static void main(String[] args) {
		int n;
		int countResult;

		System.out.print("Пожалуйста, введите число: ");
		n = valueFromConsole();
		while (n < 0) {
			System.out.print("Пожалуйста, введите целое число больше 0: ");
			n = valueFromConsole();
		}
		countResult = countSubtractSumDigits(n);

		System.out.printf("Произведено %d действий\n", countResult);

	}

	public static int countSubtractSumDigits(int n) {
		int count;

		count = 0;

		while (n > 0) {
			n -= sumDigits(n);
			count++;
		}

		return count;
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
