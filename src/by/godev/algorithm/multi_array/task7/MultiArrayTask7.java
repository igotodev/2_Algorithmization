package by.godev.algorithm.multi_array.task7;

import java.util.Scanner;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу: 
 *  A[I, J] = sin( (i^2 - j^2) / n )
 *  и подсчитать количество положительных элементов в ней.
 * */

public class MultiArrayTask7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double arr[][];
		int n;

		System.out.print("Пожалуйста, введите сторону квадратной матрицы: ");
		while (!scan.hasNextInt()) {
			System.out.print("Неправильный ввод!\nПожалуйста, введите четное число: ");
			scan.next();
		}
		n = scan.nextInt();

		while (n % 2 != 0 || n < 0) {
			System.out.print("Неправильный ввод!\nПожалуйста, введите положительное четное число: ");
			while (!scan.hasNextInt()) {
				System.out.print("Неправильный ввод!\nПожалуйста, введите положительное четное число: ");
				scan.next();
			}
			n = scan.nextInt();
		}

		arr = createMatrix(n);

		printMatrix(arr);

		System.out.println("Положительных значений в матрице: " + countPositiveInMatrix(arr));

	}

	public static double[][] createMatrix(int x) {
		double[][] arr;

		arr = new double[x][x];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / x);
			}
		}
		return arr;

	}

	public static int countPositiveInMatrix(double[][] arr) {
		int count;

		count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}
		return count;

	}

	// для красивой отрисовки
	public static void printMatrix(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("+---------------");
		}
		System.out.print("+\n");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("\t%.4f\t|", arr[i][j]);
			}
			System.out.print("\n");
			for (int d = 0; d < arr.length; d++) {
				System.out.print("+---------------");
			}
			System.out.print("+\n");
		}
	}

}
