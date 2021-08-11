package by.godev.algorithm.multi_array.task5;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * https://raw.githubusercontent.com/Java0Tutor/2_Algorithmization/master/Practice%20(tasks).pdf
 * */

import java.util.Scanner;

public class MultiArrayTask5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int arr[][];
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

	}

	public static int[][] createMatrix(int x) {
		int[][] arr;
		
		arr = new int[x][x];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length -i; j++) {
				arr[i][j] = i + 1;
			}
		}
		return arr;

	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
