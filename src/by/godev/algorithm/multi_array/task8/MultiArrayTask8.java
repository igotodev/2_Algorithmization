package by.godev.algorithm.multi_array.task8;

import java.util.Scanner;

/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца 
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 * */

public class MultiArrayTask8 {

	public static void main(String[] args) {
		int[][] arr;
		int columnOne;
		int columnTwo;

		arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		// нумерация начинается с 0-го элемента
		System.out.print("Пожалуйста, введите номер столбца, который необходимо переместить: ");
		columnOne = getColumn();
		System.out.print("Пожалуйста, введите номер столбца, который необходимо переместить: ");
		columnTwo = getColumn();

		moveColumn(arr, columnOne, columnTwo);

		printMatrix(arr);
	}

	public static int getColumn() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int column;

		while (!scan.hasNextInt()) {
			System.out.print("Ошибка ввода!\nПожалуйста, введите целое число: ");
			scan.next();
		}
		column = scan.nextInt();

		return column;
	}
	
	public static void moveColumn(int[][] arr, int colOne, int colTwo) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int mid = 0;
				if (j == colOne) {
					mid = arr[i][j];
					arr[i][j] = arr[i][colTwo];
					arr[i][colTwo] = mid;
				}
			}
		}
	}

	// для красивой отрисовки
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("+---------------");
		}
		System.out.print("+\n");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("\t%d\t|", arr[i][j]);
			}
			System.out.print("\n");
			for (int d = 0; d < arr.length; d++) {
				System.out.print("+---------------");
			}
			System.out.print("+\n");
		}
	}

}
